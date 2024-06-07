package ch06_Ex_01.mit.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ch06_Ex_01.mit.member.DBConnectionInfo;
import ch06_Ex_01.mit.member.service.CenterInformationService;

@Configuration
@Import({MemberConfig1.class, MemberConfig2.class})
public class MemberConfigImport {
	
	@Autowired
	DBConnectionInfo dev_DBConnectionInfoDev;
	
	@Autowired
	DBConnectionInfo real_DBConnectionInfo;
	
	@Bean
	public CenterInformationService centerInformationService() {
		CenterInformationService centerInformationService = 
				new CenterInformationService();
		
		centerInformationService.setInfo("Center Management System program was developed in 2022.");
		centerInformationService.setCopyRight("COPYRIGHT(C) 2022 CENTER CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		centerInformationService.setVer("The version is 1.0");
		centerInformationService.setsYear(2022);
		centerInformationService.setsMonth(3);
		centerInformationService.setsDay(1);
		centerInformationService.seteYear(2022);
		centerInformationService.seteMonth(4);
		centerInformationService.seteDay(30);
		
		List<String> developers = new ArrayList<String>();
		developers.add("Cheney");
		developers.add("Eloy");
		developers.add("Jasper");
		developers.add("Dillon");
		developers.add("Kian");
		centerInformationService.setDevelopers(developers);
		
		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("Cheney", "cheney@springPjt.org");
		administrators.put("Jasper", "jasper@springPjt.org");
		centerInformationService.setAdministrators(administrators);
		
		Map<String, DBConnectionInfo> dbInfos = new HashMap<String, DBConnectionInfo>();
		dbInfos.put("dev", dev_DBConnectionInfoDev);
		dbInfos.put("real", real_DBConnectionInfo);
		centerInformationService.setDbInfos(dbInfos);
		
		return centerInformationService;
	}
	

}
















