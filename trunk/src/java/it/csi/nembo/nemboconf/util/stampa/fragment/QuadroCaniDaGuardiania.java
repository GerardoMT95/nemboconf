package TOBECONFIG.nembo.nemboconf.util.stampa.fragment;

import javax.xml.stream.XMLStreamWriter;

import TOBECONFIG.nembo.nemboconf.business.IStampeEJB;

public class QuadroCaniDaGuardiania extends Fragment
{

  public static final String TAG_NAME_FRAGMENT = "QuadroDatiCaniGuardiania";

  @Override
  public void writeFragment(XMLStreamWriter writer, long idBandoOggetto,
      IStampeEJB stampeEJB) throws Exception
  {
    writer.writeStartElement(TAG_NAME_FRAGMENT);
    writeVisibility(writer, true);
    writer.writeEndElement(); // TAG_NAME_FRAGMENT
  }
}
