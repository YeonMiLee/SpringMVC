package quiz_Ex.member.dao;

import java.util.HashMap;
import java.util.Map;

import quiz_Ex.member.Member;

public class MemberDao {
	
	private Map<String, Member> memberinfo = new HashMap<String, Member>();
	
	public void insert(Member member) {		//추가
		memberinfo.put(member.getName(), member);
	}
	
	public Member select(String name) {		//조회
		return memberinfo.get(name);
	}
	
	public void update(Member member) {		//수정
		memberinfo.put(member.getName(), member);
	}
	
	public void delete(String name) {		//삭제
		memberinfo.remove(name);		
	}
	
	public Map<String, Member> getMemberinfo() {
		return memberinfo;
	}

}
