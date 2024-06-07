package com.company.mit.member;

public class Member {		//MIT 구민센터 회원 관리 시스템
	
	private String mId;
	private String mPw;
	private String mName;
	private String mPhone;
	private String mEmail;
	private String newDate;
	private String changeDate;	
	
	public Member(String mId, String mPw, String mName, String mPhone, String mEmail, String newDate, String changeDate) {
		this.mId = mId;
		this.mPw = mPw;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mEmail = mEmail;
		this.newDate = newDate;
		this.changeDate = changeDate;
	}
	
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	public String getNewDate() {
		return newDate;
	}
	public void setNewDate(String newDate) {
		this.newDate = newDate;
	}
	public String getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}		

	
}
