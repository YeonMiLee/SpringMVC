package ch06_Ex_01.mit.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch06_Ex_01.mit.member.Member;
import ch06_Ex_01.mit.member.dao.MemberDao;

public class MemberModifyService {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberModifyService(MemberDao memberDao) { this.memberDao = memberDao;
	 * }
	 */
	
	public void modify(Member member) {
		if(verify(member.getmId())) {
			memberDao.update(member);
		} else {
			System.out.println("infotmation is available.");
		}
	}
	
	public boolean verify(String mId) {
		Member member = memberDao.select(mId);
		return member != null ? true : false;
	}	

}
