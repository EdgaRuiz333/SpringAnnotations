package com.mdf.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");
		
		IEmpleado comercial = ctx.getBean("comercial", IEmpleado.class);
		
		System.out.println(comercial.getTareas());
		System.out.println(comercial.getInforme());
		
		ctx.close();
		
	}

}
