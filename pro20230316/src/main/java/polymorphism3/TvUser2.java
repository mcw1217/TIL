package polymorphism3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BeanFactory factory = new BeanFactory();
////		TV tv = (TV)factory.getBean("lg");

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
//		TV tv = (TV)factory.getBean("tv1");
		Address address = (Address) factory.getBean("listAddress");
		List<String> listAddress = address.getListAddress();
		System.out.println("===== listAddress=====");
		for (String addr : listAddress) {
			System.out.println(addr);
		}

		address = (Address) factory.getBean("setAddress");
		Set<String> setAddress = address.getSetAddress();
		System.out.println("===== listAddress=====");
		Iterator<String> iter = setAddress.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		address =(Address) factory.getBean("mapAddress");
		Map<String, String> mapAddress = address.getMapAddress();
		System.out.println("=====mapAddress=====");
		Set<String> set = mapAddress.keySet();
		Iterator<String> keys = set.iterator();
		while(keys.hasNext())
		{
			String key = keys.next();
			System.out.println(mapAddress.get(key));
		}



	}

}
