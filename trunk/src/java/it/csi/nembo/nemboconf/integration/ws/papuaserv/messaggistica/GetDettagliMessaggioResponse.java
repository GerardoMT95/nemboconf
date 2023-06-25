
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDettagliMessaggioResponse", propOrder =
{
    "dettagliMessaggio"
})
public class GetDettagliMessaggioResponse
    implements Serializable
{

  private final static long   serialVersionUID = 1L;
  protected DettagliMessaggio dettagliMessaggio;

  /**
   * Recupera il valore della propriet� dettagliMessaggio.
   * 
   * @return possible object is {@link DettagliMessaggio }
   * 
   */
  public DettagliMessaggio getDettagliMessaggio()
  {
    return dettagliMessaggio;
  }

  /**
   * Imposta il valore della propriet� dettagliMessaggio.
   * 
   * @param value
   *          allowed object is {@link DettagliMessaggio }
   * 
   */
  public void setDettagliMessaggio(DettagliMessaggio value)
  {
    this.dettagliMessaggio = value;
  }

}
