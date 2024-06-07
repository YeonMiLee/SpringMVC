package ch06_Ex_01.mit.member.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ch06_Ex_01.mit.member.Member;
import ch06_Ex_01.mit.member.dao.MemberDao;

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
