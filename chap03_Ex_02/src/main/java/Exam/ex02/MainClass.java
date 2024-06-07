package Exam.ex02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select language! 1.Korea, 2.english");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
				
		int select = sc.nextInt();
		switch(select) {
			case 1:
				Korea ko = ctx.getBean("ko", Korea.class);
				ko.korea();
				break;
			case 2:
				English eng = ctx.getBean("eng", English.class);
				eng.english();
				break;			
		}
		ctx.close();
		
		sc.close();
		
		
		/* Language 클래스에서 한번에 생성
		 * System.out.println("Select language! 1.korea  2.english"); Scanner scanner =
		 * new Scanner(System.in);
		 * 
		 * int selectedNumber = scanner.nextInt();
		 * 
		 * GenericXmlApplicationContext ctx = new
		 * GenericXmlApplicationContext("classpath:applicationContext.xml"); PrintHello
		 * printHello = ctx.getBean("printHello", PrintHello.class);
		 * 
		 * switch (selectedNumber) { case 1: printHello.hello_ko(); break;
		 * 
		 * case 2: printHello.hello_en(); break;
		 * 
		 * }
		 * 
		 * ctx.close(); scanner.close();
		 */

	}	

}
