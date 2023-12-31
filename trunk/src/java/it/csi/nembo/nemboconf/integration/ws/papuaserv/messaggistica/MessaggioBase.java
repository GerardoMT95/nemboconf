
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java per messaggioBase complex type.
 * 
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 * 
 * <pre>
 * &lt;complexType name="messaggioBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataInizioValidita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idElencoMessaggi" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idTipoMessaggio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="letto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="letturaObbligatoria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="titolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messaggioBase", propOrder =
{
    "dataInizioValidita",
    "idElencoMessaggi",
    "idTipoMessaggio",
    "letto",
    "letturaObbligatoria",
    "titolo"
})
public abstract class MessaggioBase
    implements Serializable
{

  private final static long      serialVersionUID = 1L;
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dataInizioValidita;
  protected long                 idElencoMessaggi;
  protected long                 idTipoMessaggio;
  protected boolean              letto;
  protected boolean              letturaObbligatoria;
  protected String               titolo;

  /**
   * Recupera il valore della proprietÓ dataInizioValidita.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getDataInizioValidita()
  {
    return dataInizioValidita;
  }

  /**
   * Imposta il valore della proprietÓ dataInizioValidita.
   * 
   * @param value
   *          allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setDataInizioValidita(XMLGregorianCalendar value)
  {
    this.dataInizioValidita = value;
  }

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
   * Recupera il valore della proprietÓ idTipoMessaggio.
   * 
   */
  public long getIdTipoMessaggio()
  {
    return idTipoMessaggio;
  }

  /**
   * Imposta il valore della proprietÓ idTipoMessaggio.
   * 
   */
  public void setIdTipoMessaggio(long value)
  {
    this.idTipoMessaggio = value;
  }

  /**
   * Recupera il valore della proprietÓ letto.
   * 
   */
  public boolean isLetto()
  {
    return letto;
  }

  /**
   * Imposta il valore della proprietÓ letto.
   * 
   */
  public void setLetto(boolean value)
  {
    this.letto = value;
  }

  /**
   * Recupera il valore della proprietÓ letturaObbligatoria.
   * 
   */
  public boolean isLetturaObbligatoria()
  {
    return letturaObbligatoria;
  }

  /**
   * Imposta il valore della proprietÓ letturaObbligatoria.
   * 
   */
  public void setLetturaObbligatoria(boolean value)
  {
    this.letturaObbligatoria = value;
  }

  /**
   * Recupera il valore della proprietÓ titolo.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTitolo()
  {
    return titolo;
  }

  /**
   * Imposta il valore della proprietÓ titolo.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setTitolo(String value)
  {
    this.titolo = value;
  }

}
