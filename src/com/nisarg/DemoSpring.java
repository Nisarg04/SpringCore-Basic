package com.nisarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {
	public static void main(String[] args) {
		System.out.println("started....");
		ApplicationContext context =   
		    new ClassPathXmlApplicationContext("Beans.xml");
		SpellChecker sc = (SpellChecker) context.getBean("sc1");
		
		System.out.println(sc.mySpellCheck());
		
		HelloSpring hs = (HelloSpring) context.getBean("helloSpring");
		  System.out.println(hs.getS1());
		
		/*HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		System.out.println("String is : " + obj.getS1());
		System.out.println(obj.getSpellCheck());*/
	}

}
