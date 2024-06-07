package quiz_Ex.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import quiz_Ex.member.Member;
import quiz_Ex.member.dao.MemberDao;

public class MemberSelect {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberSelect(MemberDao memberDao) { this.memberDao = memberDao; }
	 */
	
	public Member select(String name) {
		if(verify(name)) {
			return memberDao.select(name);
		} else { 
			System.out.println("infotmation is available.");
		}
		return null;
	}
	
	public boolean verify(String name) {
		Member member = memberDao.select(name);
		return member != null ? true : false;
	}
	

}
