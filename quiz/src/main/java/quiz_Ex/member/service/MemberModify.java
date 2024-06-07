package quiz_Ex.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import quiz_Ex.member.Member;
import quiz_Ex.member.dao.MemberDao;

public class MemberModify {

	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberModify(MemberDao memberDao) { this.memberDao = memberDao; }
	 */
	
	public void modify(Member member) {
		if(verify(member.getName())) {
			memberDao.update(member);
		} else {
			System.out.println("infotmation is available.");
		}
	}
	
	public boolean verify(String name) {
		Member member = memberDao.select(name);
		return member != null ? true : false;
	}

}
