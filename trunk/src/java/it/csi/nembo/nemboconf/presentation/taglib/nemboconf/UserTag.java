package TOBECONFIG.nembo.nemboconf.presentation.taglib.nemboconf;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

import TOBECONFIG.nembo.nemboconf.util.NemboConstants;
import TOBECONFIG.nembo.nemboconf.util.NemboUtils;
import TOBECONFIG.nembo.nemboconf.util.PapuaservUtils;
import TOBECONFIG.papua.papuaserv.dto.gestioneutenti.EnteLogin;
import TOBECONFIG.papua.papuaserv.dto.gestioneutenti.ws.UtenteAbilitazioni;

public class UserTag extends BaseTag
{
  /** serialVersionUID */
  private static final long serialVersionUID = 4558965659815071438L;

  @Override
  public int doEndTag() throws JspException
  {
    UtenteAbilitazioni utenteAbilitazioni = (UtenteAbilitazioni) this.pageContext
        .getSession().getAttribute("utenteAbilitazioni");
    if (utenteAbilitazioni != null)
    {
      JspWriter writer = this.pageContext.getOut();
      EnteLogin ente = utenteAbilitazioni.getEnteAppartenenza();
      try
      {
        writer.write(
            "<div class=\"col-xs-6 pull-right \" style=\"padding-top:8px\">\n"
                + "  <div class=\"row-fluid pull-right\">\n"
                + "<div class=\"pull-right\"> | <a href=\"\" "
                + "onclick=\" return openPageInPopup('/" + NemboConstants.NEMBOCONF.WEB_CONTEXT + "/logout/conferma.do', 'logoutDialog', 'Disconnessione utente','', true)\" style=\"color:black !important;text-decoration:none !important\">Esci <i class=\"icon-signout\" style=\"cursor:pointer\"></i></a></div>\n"
                + "    <ul class=\"list-inline pull-right\">\n"
                + "      <li>Utente <i class=\"icon icon-user\"></i>: ");
        writer.write(escapeHtml(NemboUtils.PAPUASERV
            .getDenominazioneUtente(utenteAbilitazioni)));
        writer.write("      </li>\n");
        if (NemboUtils.PAPUASERV
            .getIdEnte(ente) != PapuaservUtils.ENTE_NON_PREREGISTRATO)
        {
          writer.write("      <li>Ente: ");
          writer.write(
              escapeHtml(NemboUtils.PAPUASERV.getDenominazioneEnte(ente)));
          writer.write("</li>\n");
        }
        writer.write("    </ul>\n"
            + "  </div>\n"
            + "</div>\n");
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    return super.doEndTag();
  }

}
