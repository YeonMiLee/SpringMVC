package quiz_Ex.member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member {		// 프론트엔드 포트폴리오-영통구주민자치센터의 데이터를 관리하는 시스템을 구현
	
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String phone;
	private String program;	
	private String startDate;	
	
	public Member(String id, String pw, String name, String birth, String phone, String program, String startDate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.program = program;
		this.startDate = nowDate();
	}	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}		
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public static String nowDate() {		
		// 현재 날짜 구하기
		LocalDate now = LocalDate.now();
		// 포맷 정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// 포맷 적용
		String formatedNow = now.format(formatter);         
				
		return formatedNow;
	}
	

}
