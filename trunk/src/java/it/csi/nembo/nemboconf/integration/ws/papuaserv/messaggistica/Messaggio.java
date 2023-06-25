
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messaggio", propOrder =
{
    "conAllegati"
})
public class Messaggio
    extends MessaggioBase
    implements Serializable
{

  private final static long serialVersionUID = 1L;
  protected boolean         conAllegati;

  /**
   * Recupera il valore della proprietà conAllegati.
   * 
   */
  public boolean isConAllegati()
  {
    return conAllegati;
  }

  /**
   * Imposta il valore della proprietà conAllegati.
   * 
   */
  public void setConAllegati(boolean value)
  {
    this.conAllegati = value;
  }

}
