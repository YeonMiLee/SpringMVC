package com.company.mit.memberdao;

import java.util.HashMap;
import java.util.Map;

import com.company.mit.member.Member;

public class MemberDao {	
	
	private Map<String, Member> memberDB = new HashMap<String, Member>();
	
	public void insert(Member member) {			//추가/ id 키값
		memberDB.put(member.getmId(), member);
	}
	
	public Member select(String mId) {			//조회
		return memberDB.get(mId);
	}
	
	public void update(Member member) {			//수정
		memberDB.put(member.getmId(), member);
	}
	
	public void delete(String mId) {			//삭제
		memberDB.remove(mId);
	}
	
	public Map<String, Member> getMemberDB() {
		return memberDB;
	}
}
	
