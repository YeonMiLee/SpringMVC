package com.company.mit.memberservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.mit.member.Member;
import com.company.mit.memberdao.MemberDao;

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
