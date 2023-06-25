package TOBECONFIG.nembo.nemboconf.business;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import TOBECONFIG.nembo.nemboconf.dto.ComuneDTO;
import TOBECONFIG.nembo.nemboconf.dto.FileAllegatoParametro;
import TOBECONFIG.nembo.nemboconf.exception.DatabaseAutomationException;
import TOBECONFIG.nembo.nemboconf.exception.InternalUnexpectedException;

public interface INemboAbstractEJB
{
  public <T> T queryForObject(SqlParameterSource parameters, Class<T> objClass)
      throws DatabaseAutomationException;

  public <T> List<T> queryForList(SqlParameterSource parameters,
      Class<T> objClass) throws DatabaseAutomationException;

  public Date getSysDate() throws InternalUnexpectedException;

  public List<String[]> getStatoDatabase() throws InternalUnexpectedException;

  public FileAllegatoParametro getFileAllegatoParametro(String codice)
      throws InternalUnexpectedException;

  public Map<String, String> getParametriComune(String... idParametro)
      throws InternalUnexpectedException;

  public Map<String, String> getParametri(String[] paramNames)
      throws InternalUnexpectedException;
  
  List<ComuneDTO> getComuni(String idRegione, String istatProvincia,
	      String flagEstinto, String flagEstero) throws InternalUnexpectedException;
  
}