package TOBECONFIG.nembo.nemboconf.util.stampa.saldo;

import java.io.ByteArrayOutputStream;

import javax.xml.stream.XMLStreamWriter;

import TOBECONFIG.nembo.nemboconf.business.IStampeEJB;
import TOBECONFIG.nembo.nemboconf.util.NemboConstants;
import TOBECONFIG.nembo.nemboconf.util.stampa.Stampa;

public class LetteraIstruttoriaSaldoPositivo extends Stampa
{
  public static final String ROOT_TAG  = "Domanda";

  private String             cuNameRef = null;

  public LetteraIstruttoriaSaldoPositivo()
  {
    super();
  }

  public LetteraIstruttoriaSaldoPositivo(String cuNameRef)
  {
    super();
    this.cuNameRef = cuNameRef;
  }

  @Override
  public byte[] genera(long idBandoOggetto, String cuName) throws Exception
  {
    if (cuNameRef != null)
    {
      cuName = cuNameRef;
    }
    else
      if (!cuName.endsWith("-" + NemboConstants.ESITO.TIPO.POSITIVO))
      {
        cuName += "-" + NemboConstants.ESITO.TIPO.POSITIVO;
      }
    ByteArrayOutputStream xmlOutputStream = new ByteArrayOutputStream();
    XMLStreamWriter writer = getXMLStreamWriter(xmlOutputStream);
    generaXML(writer, idBandoOggetto, stampeEJB, cuName);

    return callModol(xmlOutputStream.toByteArray());
  }

  protected void generaXML(XMLStreamWriter writer, long idBandoOggetto,
      IStampeEJB quadroEJB, String cuName) throws Exception
  {
    writer.writeStartDocument(DEFAULT_ENCODING, "1.0");
    writer.writeStartElement(ROOT_TAG);
    // Scrivo i blocchi di default (simulando come se fossero dei fragment)
    writeFragment("HEADER_AMMISSIONE_FINANZIAMENTO", writer, idBandoOggetto,
        cuName);
    writeFragmentTesti("GLOBAL", writer, idBandoOggetto, cuName);
    writeFragmentTesti("AMMISSIONE_FINANZIAMENTO_SEZIONI_TESTO", writer,
        idBandoOggetto, cuName);
    writeFragmentTesti("AMMISSIONE_FINANZIAMENTO_INTERVENTI", writer,
        idBandoOggetto, cuName);
    writeFragment("FIRMA_AMMISSIONE_FINANZIAMENTO", writer, idBandoOggetto,
        cuName);
    writer.writeEndElement();
    writer.writeEndDocument();
  }

  protected String getCodiceModulo()
  {
    return "nembo_comunicazioneSaldo-P";
  }

  protected String getCodiceModello()
  {
    return "nembo_comunicazioneSaldo-P";
  }

  protected String getRifAdobe()
  {
    return BASE_RIF_ADOBE + "comunicazioneSaldo-P.xdp";
  }

  @Override
  public String getDefaultFileName()
  {
    return "Lettera istruttoria saldo.pdf";
  }

  @Override
  public byte[] genera(long idBandoOggetto) throws Exception
  {
    return null;
  }
}
