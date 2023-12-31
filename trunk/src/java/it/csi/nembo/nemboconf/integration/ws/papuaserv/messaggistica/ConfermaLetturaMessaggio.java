
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per confermaLetturaMessaggio complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>
 * &lt;complexType name="confermaLetturaMessaggio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idElencoMessaggi" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confermaLetturaMessaggio", propOrder =
{
    "idElencoMessaggi",
    "codiceFiscale"
})
public class ConfermaLetturaMessaggio
    implements Serializable
{

  private final static long serialVersionUID = 1L;
  protected long            idElencoMessaggi;
  protected String          codiceFiscale;

  /**
   * Recupera il valore della proprietÓ idElencoMessaggi.
   * 
   */
  public long getIdElencoMessaggi()
  {
    return idElencoMessaggi;
  }

  /**
   * Imposta il valore della proprietÓ idElencoMessaggi.
   * 
   */
  public void setIdElencoMessaggi(long value)
  {
    this.idElencoMessaggi = value;
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

}
