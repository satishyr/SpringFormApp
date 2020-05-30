package in.nit.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nit.controller.StudentController;
import in.nit.vo.StudentVO;

public class RealTimeDITest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		StudentController controller = null;
		Scanner sc = null;
		String sname = null, sadd = null, m1 = null, m2 = null, m3 = null;
		StudentVO vo = null;
		String result = null;
		// create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/nit/cfgs/applicationContext.xml");
		// get Controller class object
		controller = factory.getBean("controller", StudentController.class);
		vo = factory.getBean("stVO", StudentVO.class);
		// read inputs
		sc = new Scanner(System.in);
		System.out.println("Enter student name::");
		sname = sc.next();
		System.out.println("Enter student address::");
		sadd = sc.next();
		System.out.println("Enter student Marks1::");
		m1 = sc.next();
		System.out.println("Enter student Marks2::");
		m2 = sc.next();
		System.out.println("Enter student Marks3::");
		m3 = sc.next();
		// prepare VO class object

		vo.setSname(sname);
		vo.setSaddr(sadd);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);

		// invoke method
		try {
			result = controller.handleStudent(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("STudent Registration failed");
		}

	}// main
}// class
