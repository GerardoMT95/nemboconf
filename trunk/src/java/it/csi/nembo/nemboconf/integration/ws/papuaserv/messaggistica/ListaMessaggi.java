
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaMessaggi", propOrder =
{
    "messaggi",
    "numeroMessaggiGenerici",
    "numeroMessaggiLogout",
    "numeroMessaggiTestata",
    "numeroTotaleMessaggi"
})
public class ListaMessaggi
    implements Serializable
{

  private final static long serialVersionUID = 1L;
  @XmlElement(nillable = true)
  protected List<Messaggio> messaggi;
  protected long            numeroMessaggiGenerici;
  protected long            numeroMessaggiLogout;
  protected long            numeroMessaggiTestata;
  protected long            numeroTotaleMessaggi;

  /**
   * Gets the value of the messaggi property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the messaggi property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getMessaggi().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Messaggio }
   * 
   * 
   */
  public List<Messaggio> getMessaggi()
  {
    if (messaggi == null)
    {
      messaggi = new ArrayList<Messaggio>();
    }
    return this.messaggi;
  }

  /**
   * Recupera il valore della propriet� numeroMessaggiGenerici.
   * 
   */
  public long getNumeroMessaggiGenerici()
  {
    return numeroMessaggiGenerici;
  }

  /**
   * Imposta il valore della propriet� numeroMessaggiGenerici.
   * 
   */
  public void setNumeroMessaggiGenerici(long value)
  {
    this.numeroMessaggiGenerici = value;
  }

  /**
   * Recupera il valore della propriet� numeroMessaggiLogout.
   * 
   */
  public long getNumeroMessaggiLogout()
  {
    return numeroMessaggiLogout;
  }

  /**
   * Imposta il valore della propriet� numeroMessaggiLogout.
   * 
   */
  public void setNumeroMessaggiLogout(long value)
  {
    this.numeroMessaggiLogout = value;
  }

  /**
   * Recupera il valore della propriet� numeroMessaggiTestata.
   * 
   */
  public long getNumeroMessaggiTestata()
  {
    return numeroMessaggiTestata;
  }

  /**
   * Imposta il valore della propriet� numeroMessaggiTestata.
   * 
   */
  public void setNumeroMessaggiTestata(long value)
  {
    this.numeroMessaggiTestata = value;
  }

  /**
   * Recupera il valore della propriet� numeroTotaleMessaggi.
   * 
   */
  public long getNumeroTotaleMessaggi()
  {
    return numeroTotaleMessaggi;
  }

  /**
   * Imposta il valore della propriet� numeroTotaleMessaggi.
   * 
   */
  public void setNumeroTotaleMessaggi(long value)
  {
    this.numeroTotaleMessaggi = value;
  }

}
