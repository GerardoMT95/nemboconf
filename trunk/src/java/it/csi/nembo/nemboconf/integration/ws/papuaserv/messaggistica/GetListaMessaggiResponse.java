
package TOBECONFIG.nembo.nemboconf.integration.ws.papuaserv.messaggistica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListaMessaggiResponse", propOrder =
{
    "listaMessaggi"
})
public class GetListaMessaggiResponse
    implements Serializable
{

  private final static long serialVersionUID = 1L;
  protected ListaMessaggi   listaMessaggi;

  /**
   * Recupera il valore della proprietà listaMessaggi.
   * 
   * @return possible object is {@link ListaMessaggi }
   * 
   */
  public ListaMessaggi getListaMessaggi()
  {
    return listaMessaggi;
  }

  /**
   * Imposta il valore della proprietà listaMessaggi.
   * 
   * @param value
   *          allowed object is {@link ListaMessaggi }
   * 
   */
  public void setListaMessaggi(ListaMessaggi value)
  {
    this.listaMessaggi = value;
  }

}
