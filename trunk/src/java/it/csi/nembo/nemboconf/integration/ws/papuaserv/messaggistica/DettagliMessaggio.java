
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettagliMessaggio", propOrder =
{
    "allegati",
    "testoMessaggio",
    "utenteAggiornamento"
})
public class DettagliMessaggio
    extends MessaggioBase
    implements Serializable
{

  private final static long     serialVersionUID = 1L;
  @XmlElement(nillable = true)
  protected List<Allegato>      allegati;
  protected String              testoMessaggio;
  protected UtenteAggiornamento utenteAggiornamento;

  /**
   * Gets the value of the allegati property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the allegati property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getAllegati().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Allegato }
   * 
   * 
   */
  public List<Allegato> getAllegati()
  {
    if (allegati == null)
    {
      allegati = new ArrayList<Allegato>();
    }
    return this.allegati;
  }

  /**
   * Recupera il valore della proprietà testoMessaggio.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTestoMessaggio()
  {
    return testoMessaggio;
  }

  /**
   * Imposta il valore della proprietà testoMessaggio.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setTestoMessaggio(String value)
  {
    this.testoMessaggio = value;
  }

  /**
   * Recupera il valore della proprietà utenteAggiornamento.
   * 
   * @return possible object is {@link UtenteAggiornamento }
   * 
   */
  public UtenteAggiornamento getUtenteAggiornamento()
  {
    return utenteAggiornamento;
  }

  /**
   * Imposta il valore della proprietà utenteAggiornamento.
   * 
   * @param value
   *          allowed object is {@link UtenteAggiornamento }
   * 
   */
  public void setUtenteAggiornamento(UtenteAggiornamento value)
  {
    this.utenteAggiornamento = value;
  }

}
