package com.company.mit.memberservice;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.mit.member.Member;
import com.company.mit.memberdao.MemberDao;

public class MemberAllSelectService {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberAllSelectService(MemberDao memberDao) { this.memberDao =
	 * memberDao; }
	 */
	
	public Map<String, Member> allSelect() {
		return memberDao.getMemberDB();
	}

}
