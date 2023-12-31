package TOBECONFIG.nembo.nemboconf.util.stampa.fragment;

import javax.xml.stream.XMLStreamWriter;

import TOBECONFIG.nembo.nemboconf.business.IStampeEJB;

public class QuadroAmbitiTematici extends Fragment
{
  public static final String TAG_NAME_FRAGMENT                = "QuadroAmbitiTematici";
  public static final String TAG_NAME_SEZIONE_AMBITI_TEMATICI = "AmbitiTematici";
  public static final String TAG_NAME_SEZIONE_AMBITO_TEMATICO = "AmbitoTematico";

  @Override
  public void writeFragment(XMLStreamWriter writer, long idBandoOggetto,
      IStampeEJB stampeEJB) throws Exception
  {
    writer.writeStartElement(TAG_NAME_FRAGMENT);
    writeVisibility(writer, true);
    writer.writeEndElement();
  }
}