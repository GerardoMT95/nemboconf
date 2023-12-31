package TOBECONFIG.nembo.nemboconf.util;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.naming.InitialContext;

import TOBECONFIG.nembo.nemboconf.dto.internal.MailAttachment;
import TOBECONFIG.nembo.nemboconf.exception.InternalUnexpectedException;

public class MailUtils
{
  public void postMail(String from, String[] to, String[] ccn, String subject,
      String message,
      MailAttachment[] attachments) throws InternalUnexpectedException
  {
    try
    {
      InitialContext ic = new InitialContext();

      Session mailSession = (Session) ic
          .lookup(NemboConstants.JNDI.MAIL_SESSION);
      Message msg = new MimeMessage(mailSession);

      // Message FROM
      InternetAddress addressFrom = new InternetAddress(from);
      msg.setFrom(addressFrom);

      // Message TO
      int lengthTo = (to != null) ? to.length : 0;
      Address[] addressesTo = new Address[lengthTo];
      for (int i = 0; i < lengthTo; i++)
      {
        addressesTo[i] = new InternetAddress(to[i]);
      }

      // Message CCN
      int lengthCcn = (ccn != null) ? ccn.length : 0;
      Address[] addressesCcn = new Address[lengthCcn];
      for (int i = 0; i < lengthCcn; i++)
      {
        addressesCcn[i] = new InternetAddress(ccn[i]);
      }

      msg.setRecipients(Message.RecipientType.TO, addressesTo);
      msg.setRecipients(Message.RecipientType.BCC, addressesCcn);

      // Subject
      msg.setSubject(subject);

      // Message
      MimeBodyPart mbp = new MimeBodyPart();
      mbp.setText(message + "\n");

      // Body
      Multipart mp = new MimeMultipart();
      mp.addBodyPart(mbp);

      // Attachments
      if (attachments != null)
      {
        for (MailAttachment attach : attachments)
        {
          mbp = new MimeBodyPart();

          ByteArrayDataSource fds = new ByteArrayDataSource(attach.getAttach(),
              attach.getFileType());
          mbp.setDataHandler(new DataHandler(fds));
          mbp.setFileName(attach.getFileName());
          mp.addBodyPart(mbp);
        }
      }

      msg.setContent(mp);
      Transport.send(msg);
    }
    catch (Exception ex)
    {
      throw new InternalUnexpectedException(ex);
    }
  }
}
