package quiz_Ex.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import quiz_Ex.member.Member;
import quiz_Ex.member.dao.MemberDao;

public class MemberDelete {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberDelete(MemberDao memberDao) { this.memberDao = memberDao; }
	 */
	
	public void delete(String name) {
		if(verify(name)) {
			memberDao.delete(name);
		} else {
			System.out.println("infotmation is available.");
		}
	}
	
	public boolean verify(String name) {
		Member member = memberDao.select(name);
		return member != null ? true : false;
	}
	

}
