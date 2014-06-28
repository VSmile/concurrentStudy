package app.mail;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//邮件发送
public class SimpleMailSender {
	
	
	
//	private transient MailAuthenticator authenticator;
//	
//	private transient Session session;
//	
	
	
	
	 
	
	
	
	public void send(String smtpHost ,String from,  
            String fromUserPassword,String recipient, String subject, Object content)
    throws AddressException, MessagingException{
		
		Properties prop=new Properties();
		
//		prop.put("mail.smtp.host", smtpHost);
//		 prop.put("mail.smtp.starttls.enable","true");
//		 prop.put("mail.smtp.auth", "true"); 
		
		 prop.setProperty("mail.smtp.host", smtpHost); 
	      prop.setProperty("mail.smtp.auth", "true");
	      prop.setProperty("mail.smtp.starttls.enable", "true");
	      prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	      prop.setProperty("mail.smtp.socketFactory.fallback", "false");
	      prop.setProperty("mail.smtp.port", "465");
	      prop.setProperty("mail.debug", "true");
		
	      
	      
	      Session sendMailSession = Session.getDefaultInstance(prop,new MailAuthenticator(from,fromUserPassword));
	      Transport transport = sendMailSession.getTransport("smtp"); 
	      transport.connect(smtpHost, from, fromUserPassword); 
	      
		 MimeMessage message = new MimeMessage(sendMailSession);
		 
		 //发件人
		 message.setFrom(new InternetAddress(from));
		 
		 //收件人
		 message.setRecipient(RecipientType.TO, new InternetAddress(recipient));
		 
		 //主题
		 message.setSubject(subject);
		 
		 //内容
		 message.setContent(content.toString(),"text/html;charset=utf-8");
		 
		 //发送
		 Transport.send(message);
		
		
		 
		 transport.close(); 
	
	
	}
	
	
	
	
	
	
	
	
	
	    
	   
}
