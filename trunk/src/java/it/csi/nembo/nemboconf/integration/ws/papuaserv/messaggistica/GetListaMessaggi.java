
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per getListaMessaggi complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>
 * &lt;complexType name="getListaMessaggi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProcedimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiceRuolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMessaggio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="letto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="obbligatorio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="visibile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListaMessaggi", propOrder =
{
    "idProcedimento",
    "codiceRuolo",
    "codiceFiscale",
    "tipoMessaggio",
    "letto",
    "obbligatorio",
    "visibile"
})
public class GetListaMessaggi
    implements Serializable
{

  private final static long serialVersionUID = 1L;
  protected int             idProcedimento;
  protected String          codiceRuolo;
  protected String          codiceFiscale;
  protected int             tipoMessaggio;
  protected Boolean         letto;
  protected Boolean         obbligatorio;
  protected Boolean         visibile;

  /**
   * Recupera il valore della proprietÓ idProcedimento.
   * 
   */
  public int getIdProcedimento()
  {
    return idProcedimento;
  }

  /**
   * Imposta il valore della proprietÓ idProcedimento.
   * 
   */
  public void setIdProcedimento(int value)
  {
    this.idProcedimento = value;
  }

  /**
   * Recupera il valore della proprietÓ codiceRuolo.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodiceRuolo()
  {
    return codiceRuolo;
  }

  /**
   * Imposta il valore della proprietÓ codiceRuolo.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setCodiceRuolo(String value)
  {
    this.codiceRuolo = value;
  }

  /**
   * Recupera il valore della proprietÓ codiceFiscale.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodiceFiscale()
  {
    return codiceFiscale;
  }

  /**
   * Imposta il valore della proprietÓ codiceFiscale.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setCodiceFiscale(String value)
  {
    this.codiceFiscale = value;
  }

  /**
   * Recupera il valore della proprietÓ tipoMessaggio.
   * 
   */
  public int getTipoMessaggio()
  {
    return tipoMessaggio;
  }

  /**
   * Imposta il valore della proprietÓ tipoMessaggio.
   * 
   */
  public void setTipoMessaggio(int value)
  {
    this.tipoMessaggio = value;
  }

  /**
   * Recupera il valore della proprietÓ letto.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isLetto()
  {
    return letto;
  }

  /**
   * Imposta il valore della proprietÓ letto.
   * 
   * @param value
   *          allowed object is {@link Boolean }
   * 
   */
  public void setLetto(Boolean value)
  {
    this.letto = value;
  }

  /**
   * Recupera il valore della proprietÓ obbligatorio.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isObbligatorio()
  {
    return obbligatorio;
  }

  /**
   * Imposta il valore della proprietÓ obbligatorio.
   * 
   * @param value
   *          allowed object is {@link Boolean }
   * 
   */
  public void setObbligatorio(Boolean value)
  {
    this.obbligatorio = value;
  }

  /**
   * Recupera il valore della proprietÓ visibile.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isVisibile()
  {
    return visibile;
  }

  /**
   * Imposta il valore della proprietÓ visibile.
   * 
   * @param value
   *          allowed object is {@link Boolean }
   * 
   */
  public void setVisibile(Boolean value)
  {
    this.visibile = value;
  }

}
