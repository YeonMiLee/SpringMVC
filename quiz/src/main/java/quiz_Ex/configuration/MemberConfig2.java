package quiz_Ex.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import quiz_Ex.member.service.CenterInformation;

@Configuration
public class MemberConfig2 {
	
	@Bean
	public CenterInformation centerInfo() {
		CenterInformation centerInfo = new CenterInformation();
		
		centerInfo.setInfo("Center Management System program was developed in 2022.");
		centerInfo.setCopyRight("COPYRIGHT(C) 2022 CENTER CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		centerInfo.setVer("The version is 1.0");
		centerInfo.setsYear(2022);
		centerInfo.setsMonth(3);
		centerInfo.setsDay(5);
		centerInfo.seteYear(2022);
		centerInfo.seteMonth(4);
		centerInfo.seteDay(30);			
		
		List<String> developers = new ArrayList<String>();
		developers.add("agatha");
		developers.add("barbara");
		developers.add("chris");
		developers.add("belle");
		developers.add("elva");
		centerInfo.setDevelopers(developers);
		
		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("agatha", "agatha@springPjt.org");
		administrators.put("chris", "chris@springPjt.org");
		centerInfo.setAdministrators(administrators);
		
		return centerInfo;
	}

}




















