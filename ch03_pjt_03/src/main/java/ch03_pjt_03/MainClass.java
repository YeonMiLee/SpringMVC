package ch03_pjt_03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
		calAssembler.assemble();
		
		ctx.close();
		
		
		/*
		 * new CalAssembler(); //어셈블러 객체만 생성
		 */		
		/*
		 * MyCalculator calculator = new MyCalculator();
		 * 
		 * calculator.calculate(10, 5, new CalAdd()); calculator.calculate(10, 5, new
		 * CalSub()); calculator.calculate(10, 5, new CalMul());
		 * calculator.calculate(10, 5, new CalDiv());
		 */
	}

}
