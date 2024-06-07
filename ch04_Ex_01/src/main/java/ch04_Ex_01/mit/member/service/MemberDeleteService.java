package ch04_Ex_01.mit.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch04_Ex_01.mit.member.Member;
import ch04_Ex_01.mit.member.dao.MemberDao;

public class MemberDeleteService {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberDeleteService(MemberDao memberDao) { this.memberDao = memberDao;
	 * }
	 */
	
	public void delete(String mId) {
		if(verify(mId)) {
			memberDao.delete(mId);
		} else {
			System.out.println("infotmation is available.");
		}
	}
	
	public boolean verify(String mId) {
		Member member = memberDao.select(mId);
		return member != null ? true : false;
	}

}
