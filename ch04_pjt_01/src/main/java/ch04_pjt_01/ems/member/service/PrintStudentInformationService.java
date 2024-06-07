package ch04_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.Student;

public class PrintStudentInformationService {
	
	StudentAllSelectService allSelectService;

	public PrintStudentInformationService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}
	
	public void printStudentsInfo() {
		Map<String, Student> allStudent = allSelectService.allSelect();
		Set<String> keys = allStudent.keySet();				//Set 은 index 넘버가 없고 순서가 없음 (key와 value로 구성) 
		//다음항목으로 넘어가기 위해(반복) iterator사용
		Iterator<String> iterator = keys.iterator();		//iterator 반복키
		//컨테이너, 특히 리스트를 순회할 수 있게 해주는 객체의 종류
		System.out.println("STUDENT LIST START --------");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Student student = allStudent.get(key);
			System.out.print("sNum: " + student.getsNum() + "\t");
			System.out.print("|sId: " + student.getsId() + "\t");
			System.out.print("|sPw: " + student.getsPw() + "\t");
			System.out.print("|sName: " + student.getsName() + "\t");
			System.out.print("|sAge: " + student.getsAge() + "\t");
			System.out.print("|sGender: " + student.getsGender() + "\t");
			System.out.println("|sMajor: " + student.getsMajor() + "\t");
		}
		System.out.println("END --------");
	}

}
