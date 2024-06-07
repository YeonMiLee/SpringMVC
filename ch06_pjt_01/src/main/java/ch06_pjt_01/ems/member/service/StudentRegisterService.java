package ch06_pjt_01.ems.member.service;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDao;

public class StudentRegisterService {
	
	private StudentDao studentDao;
	
	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {			//verify() = 학생넘버로 기존에 등록된 학생인지 체크
		if(verify(student.getsNum())) {				
			studentDao.insert(student);
		} else {									//이미 등록된 학생일 경우 문구 출력
			System.out.println("The student has already registered.");
		}
	}
	
	public boolean verify(String sNum) {			//StudentDao class에 select 값이 null인지 체크
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
	}
}
