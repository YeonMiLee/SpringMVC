package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	//controller page에 signup/signin 메소드 생성
	
	//의존 객체 직접 생성
	/* MemberService memberService = new MemberService(); */
	
	//의존 객체 자동 생성
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/signUp")	//요청 url매핑
	public String signUp() {
		return "sign_up";		//sign_up.jsp
	}
	
	@RequestMapping("/signIn")	//요청 url매핑
	public String signIn() {
		return "sign_in";		//sign_in.jsp
	}
	
	
	/*
	 * @RequestMapping("/signUpConfirm") public String signUpConfirm() {
	 * System.out.println("[MemberController] signUpConfirm()");
	 * 
	 * return null; }
	 */
	
//	@RequestMapping("/signUpConfirm")
//	public String signUpConfirm(@RequestParam String m_id,
//			/* @RequestParam String m_pw, */ @RequestParam int m_pw,
//			@RequestParam String m_mail,@RequestParam String m_phone) {
//		System.out.println("[MemberController] signUpConfirm()");
//		System.out.println("m_id: R" + m_id); 
//		System.out.println("m_pw: " + m_pw);
//		System.out.println("m_pw type: " + ((Object)m_pw).getClass().getName());	//Object로 캐스팅
//		System.out.println("m_mail: " + m_mail); 
//		System.out.println("m_phone: " + m_phone);
//		
//		return null;
//	}
	

//	@RequestMapping("/signUpConfirm")
//	public String signUpConfirm(@RequestParam String m_id,
//			/* @RequestParam String m_pw, */ @RequestParam Integer m_pw,
//			@RequestParam String m_mail,@RequestParam String m_phone) {
//		System.out.println("[MemberController] signUpConfirm()");
//		System.out.println("m_id: R" + m_id); 
//		System.out.println("m_pw: " + m_pw);
//		System.out.println("m_pw type: " + m_pw.getClass().getName());	//Object로 캐스팅
//		System.out.println("m_mail: " + m_mail); 
//		System.out.println("m_phone: " + m_phone);
//		
//		return null;
//	}
	
	
	@RequestMapping("/signUpConfirm")
	public String signUpConfirm(MemberVo memberVo) {
		System.out.println("[MemberController] signUpConfirm()");
		
		System.out.println("m_id: " + memberVo.getM_id());
		System.out.println("m_pw: " + memberVo.getM_pw());
		System.out.println("m_mail: " + memberVo.getM_mail());
		System.out.println("m_phone: " + memberVo.getM_phone());
		
		memberService.signUpConfirm(memberVo);		
//		return null;
		return "sign_up_ok";
	}
	
	
	@RequestMapping("/signInConfirm")		//매핑
	public String signInConfirm(MemberVo memberVo) {
		System.out.println("[MemberController] signInConfirm()");
		
		MemberVo signInedMember = memberService.signInConfirm(memberVo);	//서비스 호출
		
		if(signInedMember != null)	//로그인 성공
			return "sign_in_ok";
		else						//로그인실패
			return "sign_in_ng";
	}

}
































