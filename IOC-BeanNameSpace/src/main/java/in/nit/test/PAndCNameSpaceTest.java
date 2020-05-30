package in.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nit.beans.Student;

/**
 * Hello world!
 *
 */
public class PAndCNameSpaceTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Student st = null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/in/nit/cfgs/applicationContext.xml");
		st = factory.getBean("st", Student.class);
		System.out.println(st);

	}
}
