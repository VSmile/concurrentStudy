package app.mail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Test {

	/**
	 * @param args
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	public static void main(String[] args) throws AddressException, MessagingException {
		SimpleMailSender test=new SimpleMailSender();
		
		
//		test.send("smtp.qq.com","574652411@qq.com", "zhaoyuefei741", "987907350@qq.com", "hi", "hi");
//		test.send("smtp.qq.com","NTc0NjUyNDExQHFxLmNvbQ==", "emhhb3l1ZWZlaTc0MQ==", "987907350@qq.com", "hi", "hi");
//		test.send("smtp.qq.com","574652411@qq.com", "emhhb3l1ZWZlaTc0MQ==", "987907350@qq.com", "hi", "hi");
		test.send("smtp.163.com","anxie741@163.com", "zyf7202838", "987907350@qq.com", "hi", "hi");
	}

}
