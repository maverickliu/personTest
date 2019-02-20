package com.test;

import com.iocFactory.ApplicationContext;
import com.iocFactory.impl.ClassPathXMLApplicationContext;
import com.service.StudentService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXMLApplicationContext("applicationContext.xml");
		StudentService stuServ = (StudentService) context.getBean("StudentService");
		
		stuServ.getStudent().selfIntroDuction();
	}

	
	
}
