package com.company.mit.member;

public class DBConnectionInfo {		//<MIT 구민센터 회원 관리 시스템> 데이터베이스 연결에 필요한 정보

	private String url;
	private String userId;
	private String userPw;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}
