package ch06_pjt_01.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;

@Configuration
public class MemberConfig2 {	
	
	@Bean		//setter이용 주입 (appCtx.xml=>개발에 이용하는 데이터베이스 빈)
	public DBConnectionInfo dev_DBConnectionInfoDev() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("000.000.000.000");
		dbConnectionInfo.setUserId("admin");
		dbConnectionInfo.setUserPw("0000");
		
		return dbConnectionInfo;
	}	
	@Bean		//setter이용 주입 (appCtx.xml=>실제서비스에 이용하는 데이터베이스 빈)
	public DBConnectionInfo real_DBConnectionInfo() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		
		dbConnectionInfo.setUrl("111.111.111.111");
		dbConnectionInfo.setUserId("master");
		dbConnectionInfo.setUserPw("1111");
		
		return dbConnectionInfo;
	}
	
}






















