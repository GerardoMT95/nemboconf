package TOBECONFIG.nembo.nemboconf.integration;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import TOBECONFIG.nembo.nemboconf.exception.DatabaseAutomationException;
import TOBECONFIG.nembo.nemboconf.integration.cache.CacheManager;
import TOBECONFIG.nembo.nemboconf.integration.cache.TableMappingForUpdateByAnnotation;

public class DatabaseUpdater
{
  protected NamedParameterJdbcOperations jdbcOperations = null;

  public DatabaseUpdater(NamedParameterJdbcOperations jdbcOperations)
  {
    this.jdbcOperations = jdbcOperations;
  }

  public void update(IPersistent... persistentObjects)
      throws DatabaseAutomationException
  {
    if (persistentObjects != null)
    {
      for (IPersistent persistentObject : persistentObjects)
      {
        if (persistentObject instanceof IIterableOfPersistent)
        {
          for (IPersistent innerPersistentObject : ((IIterableOfPersistent) persistentObject)
              .getIterable())
          {
            performUpdate(innerPersistentObject);
          }
        }
        else
        {
          performUpdate(persistentObject);
        }
      }
    }
  }

  public void insert(IPersistent... persistentObjects)
      throws DatabaseAutomationException
  {
    if (persistentObjects != null)
    {
      for (IPersistent persistentObject : persistentObjects)
      {
        if (persistentObject instanceof IIterableOfPersistent)
        {
          for (IPersistent innerPersistentObject : ((IIterableOfPersistent) persistentObject)
              .getIterable())
          {
            performInsert(innerPersistentObject);
          }
        }
        else
        {
          performInsert(persistentObject);
        }
      }
    }
  }

  private void performUpdate(IPersistent persistentObject)
      throws DatabaseAutomationException
  {
    TableMappingForUpdateByAnnotation tableMapping = getTableMapping(
        persistentObject);
    MapSqlParameterSource source = tableMapping
        .getSqlParameterSource(persistentObject, true);
    jdbcOperations.update(tableMapping.getSqlForUpdate(), source);
  }

  private void performInsert(IPersistent persistentObject)
      throws DatabaseAutomationException
  {
    TableMappingForUpdateByAnnotation tableMapping = getTableMapping(
        persistentObject);
    MapSqlParameterSource source = tableMapping
        .getSqlParameterSource(persistentObject, true);
    jdbcOperations.update(tableMapping.getSqlForInsert(), source);
  }

  protected TableMappingForUpdateByAnnotation getTableMapping(
      IPersistent persistentObject)
      throws DatabaseAutomationException
  {
    Class<?> classObject = persistentObject.getClass();
    TableMappingForUpdateByAnnotation tableMapping = CacheManager
        .getTableDefinitionForUpdate(classObject);
    if (tableMapping == null)
    {
      tableMapping = createMapping(classObject);
    }
    return tableMapping;
  }

  protected TableMappingForUpdateByAnnotation createMapping(
      Class<?> classObject) throws DatabaseAutomationException
  {
    TableMappingForUpdateByAnnotation mapping = new TableMappingForUpdateByAnnotation(
        classObject);
    return CacheManager.addTableDefinitionForUpdate(classObject.getName(),
        mapping);
  }

}
