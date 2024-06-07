package ch06_pjt_01.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ch06_pjt_01.ems.member.Student;

public class StudentDao {
	
	private Map<String, Student> studentDB = new HashMap<String, Student>();
	
	public void insert(Student student) {				//입력(새로 추가)
		studentDB.put(student.getsNum(), student);		//sNum 키값으로 사용
	}
	
	public Student select(String sNum) {				//조회
		return studentDB.get(sNum);
	}
	
	public void update(Student student) {				//수정
		studentDB.put(student.getsNum(), student);
	}
	
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}
	
	public Map<String, Student> getStudentDB() {
		return studentDB;
	}

}
