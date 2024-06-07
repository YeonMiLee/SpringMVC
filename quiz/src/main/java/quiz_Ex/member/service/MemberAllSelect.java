package quiz_Ex.member.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import quiz_Ex.member.Member;
import quiz_Ex.member.dao.MemberDao;

public class MemberAllSelect {
	
	@Autowired
	private MemberDao memberDao;

	/*
	 * public MemberAllSelect(MemberDao memberDao) { this.memberDao = memberDao; }
	 */
	
	public Map<String, Member> allSelect() {
		return memberDao.getMemberinfo();
	}
	

}
