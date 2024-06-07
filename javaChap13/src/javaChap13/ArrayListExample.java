package javaChap13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");					//스트링 객체 저장
		list.add("JDBC");
		list.add("servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();				//저장된 총 객체 수 얻기
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);			//2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {	//저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove(2);			//2번인덱스 객체(Database) 삭제
		list.remove(2);			//2번인덱스 객체(servlet/JSP) 삭제
		list.remove("iBATIS");  //객체(iBATIS) 삭제
		
		for(int i=0; i<list.size(); i++) {	//저장된 총 객체 수 만큼 루핑
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

	}

}
