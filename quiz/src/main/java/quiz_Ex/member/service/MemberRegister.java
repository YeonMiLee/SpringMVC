package quiz_Ex.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import quiz_Ex.member.Member;
import quiz_Ex.member.dao.MemberDao;

public class MemberRegister {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberRegister(MemberDao memberDao) { this.memberDao = memberDao; }
	 */
	
	public void register(Member member) {
		if(verify(member.getName())) {
			memberDao.insert(member);
		} else {
			System.out.println("infotmation is available.");
		}
	}
	
	public boolean verify(String name) {
		Member member = memberDao.select(name);
		return member == null ? true : false;
	}
	

}
