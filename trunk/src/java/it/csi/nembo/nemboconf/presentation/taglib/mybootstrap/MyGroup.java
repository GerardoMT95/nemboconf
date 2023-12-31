package TOBECONFIG.nembo.nemboconf.presentation.taglib.mybootstrap;

import TOBECONFIG.nembo.nemboconf.util.NemboUtils;
import TOBECONFIG.nembo.nemboconf.util.validator.Errors;

public class MyGroup extends MyBodyTag
{
  /** serialVersionUID */
  private static final long serialVersionUID = -5797415003553204256L;
  protected String          cssClass;
  protected String          errorField;

  protected void writeCustomTag(StringBuilder sb, String errorMessage)
  {
    sb.append("<div");
    Errors errors = getErrors();
    String cssError = null;
    if (errors != null)
    {
      String error = errors.get(errorField);
      if (error != null)
      {
        cssError = "has-error";
      }
      else
      {
        cssError = "has-success";
      }
    }
    TAG_UTIL.addAttribute(sb, "class",
        NemboUtils.STRING.concat(" ", "input-group", cssClass, cssError));
    sb.append("/>");
    if (bodyContent != null)
    {
      sb.append(bodyContent.getString());
    }
    sb.append("</div>");
  }

  public String getCssClass()
  {
    return cssClass;
  }

  public void setCssClass(String cssClass)
  {
    this.cssClass = cssClass;
  }
}
