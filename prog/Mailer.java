package My; /**
 * Created by Andrzej on 2017-06-28.
 */
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.*;
import javax.mail.*;
import javax.swing.JOptionPane;

public class Mailer {
    static public void SendingMassage(){
        Properties p = new Properties();
        p.put("mail.smtp.host","smtp.yandex.ru");
        p.put("mail.smtp.socketFactory.port", 465);
        p.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory" );
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.port", 465);


        Session s = Session.getDefaultInstance(p,

                new javax.mail.Authenticator(){

                    protected PasswordAuthentication getPasswordAuthentication(){

                        return new PasswordAuthentication("PosnetThermalHD@yandex.ru","Androsiuk2017");}});


        try{
            Message message = new MimeMessage(s);
            message.setFrom(new InternetAddress("PosnetThermalHD@yandex.ru"));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse("andrzej.androsiuk@mip.biz.pl"));

            message.setSubject("Testing mail");
            message.setText("All right baby");

            Transport.send(message);
            JOptionPane.showMessageDialog(null,"OK");



        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Something going wrong");
        }
    }
}
