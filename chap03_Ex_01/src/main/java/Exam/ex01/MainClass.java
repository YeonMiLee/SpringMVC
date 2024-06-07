package Exam.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		PrintHello printHello = ctx.getBean("printHello", PrintHello.class);
		printHello.hello();
		
		ctx.close();

	}

}
