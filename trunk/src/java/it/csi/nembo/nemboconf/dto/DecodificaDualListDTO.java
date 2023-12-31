package TOBECONFIG.nembo.nemboconf.dto;

import TOBECONFIG.nembo.nemboconf.dto.internal.ILoggable;

public class DecodificaDualListDTO<T> implements ILoggable
{
  /** serialVersionUID */
  private static final long serialVersionUID = 4601339650061084885L;
  private T                 id;
  private String            descrizione;
  private String            codice;
  private String            gruppo;

  public DecodificaDualListDTO()
  {
  }

  public DecodificaDualListDTO(T id, String descrizione)
  {
    this.id = id;
    this.descrizione = descrizione;
  }

  public DecodificaDualListDTO(T id, String codice, String descrizione,
      String gruppo)
  {
    this.id = id;
    this.descrizione = descrizione;
    this.codice = codice;
    this.gruppo = gruppo;
  }

  public T getId()
  {
    return id;
  }

  public void setId(T id)
  {
    this.id = id;
  }

  public String getDescrizione()
  {
    return descrizione;
  }

  public void setDescrizione(String descrizione)
  {
    this.descrizione = descrizione;
  }

  public String getCodice()
  {
    return codice;
  }

  public void setCodice(String codice)
  {
    this.codice = codice;
  }

  public String getCodiceDescrizione()
  {
    return codice + " - " + descrizione;
  }

  public String getGruppo()
  {
    return gruppo;
  }

  public void setGruppo(String gruppo)
  {
    this.gruppo = gruppo;
  }

}
