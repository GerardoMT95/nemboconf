package TOBECONFIG.nembo.nemboconf.presentation.taglib.nemboconf.table;

import javax.servlet.jsp.JspException;

import org.apache.commons.validator.GenericValidator;

import TOBECONFIG.nembo.nemboconf.presentation.taglib.nemboconf.BaseTag;

/**
 * E' giusto un contenitore, non fa niente altro che "contenere il codice html
 * dell'header"
 */
public class TableHeaderTag extends BaseTag
{
  /** serialVersionUID */
  private static final long serialVersionUID = 6631325238199327178L;

  @Override
  public int doEndTag() throws JspException
  {
    String body = this.getBodyContent().getString();
    if (!GenericValidator.isBlankOrNull(body))
    {
      TableTag parent = (TableTag) findAncestorWithClass(this,
          TableTag.class);
      if (parent != null)
      {
        parent.setCustomHeader(body);
      }
    }
    return super.doEndTag();
  }
}