package quiz_Ex.member.service;

import java.util.List;
import java.util.Map;

public class CenterInformation {
	
	private String info;
	private String copyRight;
	private String ver;
	private int sYear;
	private int sMonth;
	private int sDay;
	private int eYear;
	private int eMonth;
	private int eDay;
	private List<String> developers;
	private Map<String, String> administrators;
	
	public void printCenterInfo() {
		System.out.println("CENTER INFORMATION------------------");
		String devPeriod = sYear + "/" + sMonth + "/" + sDay + "~" + eYear + "/" + eMonth + "/" + eDay;
		System.out.println(info + "(" + devPeriod + ").");
		System.out.println(copyRight);
		System.out.println(ver);
		System.out.println("Developers: " + developers);
		System.out.println("Administrators: " + administrators);
		System.out.println("-----------------------------------");
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCopyRight() {
		return copyRight;
	}
	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	public int getsYear() {
		return sYear;
	}
	public void setsYear(int sYear) {
		this.sYear = sYear;
	}
	public int getsMonth() {
		return sMonth;
	}
	public void setsMonth(int sMonth) {
		this.sMonth = sMonth;
	}
	public int getsDay() {
		return sDay;
	}
	public void setsDay(int sDay) {
		this.sDay = sDay;
	}
	public int geteYear() {
		return eYear;
	}
	public void seteYear(int eYear) {
		this.eYear = eYear;
	}
	public int geteMonth() {
		return eMonth;
	}
	public void seteMonth(int eMonth) {
		this.eMonth = eMonth;
	}
	public int geteDay() {
		return eDay;
	}
	public void seteDay(int eDay) {
		this.eDay = eDay;
	}
	public List<String> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<String> developers) {
		this.developers = developers;
	}
	public Map<String, String> getAdministrators() {
		return administrators;
	}
	public void setAdministrators(Map<String, String> administrators) {
		this.administrators = administrators;
	}
	

}
