package ch04_Ex_01.mit.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch04_Ex_01.mit.member.Member;
import ch04_Ex_01.mit.member.dao.MemberDao;

public class MemberRegisterService {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberRegisterService(MemberDao memberDao) { this.memberDao =
	 * memberDao; }
	 */
	
	public void register(Member member) {
		if(verify(member.getmId())) {
			memberDao.insert(member);
		} else {
			System.out.println("infotmation is available.");
		}
	}
	
	public boolean verify(String mId) {
		Member member = memberDao.select(mId);
		return member == null ? true : false;
	}

}
