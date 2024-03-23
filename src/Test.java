import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  

import model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ClassPathResource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
        Student s=(Student)factory.getBean("e"); 
        s.displayInfo();
	}

}
