package quiz_Ex.member.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import quiz_Ex.configuration.MemberConfig1;
import quiz_Ex.member.Member;
import quiz_Ex.member.service.CenterInformation;
import quiz_Ex.member.service.MemberDelete;
import quiz_Ex.member.service.MemberModify;
import quiz_Ex.member.service.MemberRegister;
import quiz_Ex.member.service.MemberSelect;
import quiz_Ex.member.service.PrintMemberInformation;
import quiz_Ex.member.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(MemberConfig1.class);
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] ids = initSampleData.getIds();
		String[] pws = initSampleData.getPws();
		String[] names = initSampleData.getNames();
		String[] births = initSampleData.getBirths();
		String[] phones = initSampleData.getPhones();
		String[] programs = initSampleData.getPrograms();
		String[] startDates = initSampleData.getStartDates();
		
		//데이터베이스에 샘플 데이터 등록
		MemberRegister mregister = ctx.getBean("memberRegister", MemberRegister.class);
		for(int i=0; i<ids.length; i++) {
			mregister.register(new Member(ids[i],pws[i],names[i],births[i],phones[i],programs[i],startDates[i]));
		}
		
		//샘플데이터 조회
		System.out.println("<샘플데이터 조회>");
		PrintMemberInformation printMemberInformation = ctx.getBean("printMemberInformation", PrintMemberInformation.class);
		printMemberInformation.printMemberInfo();
		
		//신규등록
		mregister = ctx.getBean("memberRegister", MemberRegister.class);
		mregister.register(new Member("community06","6000com","aurora","300405","01098732165","서예교실","2024/3/5"));
		
		//조회
		System.out.println("<신규 회원 등록 후 조회>");
		printMemberInformation.printMemberInfo();
		
		System.out.println("<중복 회원 등록 후 조회>");
		mregister.register(new Member("community06","6000com","aurora","300405","01098732165","서예교실","2024/3/5"));
		
		//이름으로 조회
		MemberSelect mselect = ctx.getBean("memberSelect", MemberSelect.class);
		Member oneselect = mselect.select("belle");
		
		System.out.print("< " + oneselect.getName() + " > 회원 정보-----");
		System.out.print("ID: " + oneselect.getId() + "\t");
		System.out.print("|PW: " + oneselect.getPw() + "\t");		
		System.out.print("|BIRTH: " + oneselect.getBirth() + "\t");
		System.out.print("|PHONE: " + oneselect.getPhone() + "\t");
		System.out.print("|PROGRAM: " + oneselect.getProgram() + "\t");
		System.out.print("|최초입력일: " + oneselect.getStartDate() + "\t");		
		System.out.println("---------------------------");
		
		//정보 수정
		MemberModify mmodify = ctx.getBean("memberModify", MemberModify.class);
		mmodify.modify(new Member("community06","6000com","aurora","300405","01098732165","서양화그리기","2024/3/5"));
		//aurora 회원의 수강프로그램 수정
		printMemberInformation.printMemberInfo();	//수정확인
		
		//삭제
		MemberDelete mdelete = ctx.getBean("memberDelete", MemberDelete.class);
		mdelete.delete("aurora");
		//삭제확인
		printMemberInformation.printMemberInfo();
		
		//시스템 정보
		System.out.println("<센터 정보>");
		CenterInformation center = ctx.getBean("centerInfo", CenterInformation.class);
		center.printCenterInfo();
		
		ctx.close();
	}

}



















