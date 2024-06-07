package ch06_Ex_01.mit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_Ex_01.mit.member.dao.MemberDao;
import ch06_Ex_01.mit.member.service.MemberAllSelectService;
import ch06_Ex_01.mit.member.service.MemberDeleteService;
import ch06_Ex_01.mit.member.service.MemberModifyService;
import ch06_Ex_01.mit.member.service.MemberRegisterService;
import ch06_Ex_01.mit.member.service.MemberSelectService;
import ch06_Ex_01.mit.member.service.PrintMemberInformationService;
import ch06_Ex_01.mit.utils.InitSampleData;

@Configuration
public class MemberConfig1 {
	
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData();
		
		String[] mIds = {"hbm001","hbm002","hbm003","hbm004","hbm005"};
		initSampleData.setmIds(mIds);
		String[] mPws = {"p0001","p0002","p0003","p0004","p0005"};
		initSampleData.setmPws(mPws);
		String[] mNames = {"agatha","barbara","chris","doris","elva"};
		initSampleData.setmNames(mNames);
		String[] mPhones = {"010000000","010000000","010000000","010000000","010000000"};
		initSampleData.setmPhones(mPhones);
		String[] mEmails = {"xxx@xxx.com","xxx@xxx.com","xxx@xxx.com","xxx@xxx.com","xxx@xxx.com"};
		initSampleData.setmEmails(mEmails);
		String[] newDates = {"2023/12/05","2023/12/05","2023/12/05","2023/12/05","2023/12/05"};
		initSampleData.setNewDates(newDates);
		String[] changeDates = {"2023/12/05","2023/12/05","2023/12/05","2023/12/05","2023/12/05"};
		initSampleData.setChangeDates(changeDates);
		
		return initSampleData;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}	
	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService();
	}
	@Bean
	public MemberModifyService memberModifyService() {
		return new MemberModifyService();
	}
	@Bean
	public MemberDeleteService memberDeleteService() {
		return new MemberDeleteService();
	}
	@Bean
	public MemberSelectService memberSelectService() {
		return new MemberSelectService();
	}
	@Bean
	public MemberAllSelectService memberAllSelectService() {
		return new MemberAllSelectService();
	}
	@Bean
	public PrintMemberInformationService printMemberInformationService() {
		return new PrintMemberInformationService();
	}


}






















