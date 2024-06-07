package com.company.mit.memberservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.mit.member.Member;
import com.company.mit.memberdao.MemberDao;

public class MemberSelectService {
	
	@Autowired
	public MemberDao memberDao;

	/*
	 * public MemberSelectService(MemberDao memberDao) { this.memberDao = memberDao;
	 * }
	 */
	
	public Member select(String mId) {
		if(verify(mId)) {
			return memberDao.select(mId);
		} else {
			System.out.println("infotmation is available.");
		}
		return null;
	}
	
	public boolean verify(String mId) {
		Member member = memberDao.select(mId);
		return member != null ? true : false;
	}

}
