package com.company.mit.memberservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.mit.member.Member;
import com.company.mit.memberdao.MemberDao;

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
