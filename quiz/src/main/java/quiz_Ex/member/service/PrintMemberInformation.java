package quiz_Ex.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import quiz_Ex.member.Member;

public class PrintMemberInformation {
	
	@Autowired
	MemberAllSelect memberAllSelect;

	/*
	 * public PrintMemberInformation(MemberAllSelect memberAllSelect) {
	 * this.memberAllSelect = memberAllSelect; }
	 */
	
	public void printMemberInfo() {
		Map<String, Member> allMember = memberAllSelect.allSelect();
		Set<String> keys = allMember.keySet();
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("MEMBER LIST-----------");
		while(iterator.hasNext()) {
			String key = iterator.next();
			Member member = allMember.get(key);
			
			System.out.print("ID: " + member.getId() + "\t");
			System.out.print("|PW: " + member.getPw() + "\t");
			System.out.print("|NAME: " + member.getName() + "\t");
			System.out.print("|BIRTH: " + member.getBirth() + "\t");
			System.out.print("|PHONE: " + member.getPhone() + "\t");
			System.out.print("|PROGRAM: " + member.getProgram() + "\t");
			System.out.print("|최초입력일: " + member.getStartDate() + "\t");			
		}
		System.out.println("----------------------");
	}
	

}
