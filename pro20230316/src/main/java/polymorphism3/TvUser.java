package polymorphism3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BeanFactory factory = new BeanFactory();
////		TV tv = (TV)factory.getBean("lg");
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV)factory.getBean("tv1");
//		TV tv = (TV)factory.getBean(args[1]);
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOn();

	}

}
