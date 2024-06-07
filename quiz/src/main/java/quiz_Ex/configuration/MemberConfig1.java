package quiz_Ex.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import quiz_Ex.member.dao.MemberDao;
import quiz_Ex.member.service.MemberAllSelect;
import quiz_Ex.member.service.MemberDelete;
import quiz_Ex.member.service.MemberModify;
import quiz_Ex.member.service.MemberRegister;
import quiz_Ex.member.service.MemberSelect;
import quiz_Ex.member.service.PrintMemberInformation;
import quiz_Ex.member.utils.InitSampleData;

@Configuration
@Import({MemberConfig2.class})
public class MemberConfig1 {
	
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData();
		
		String[] ids = {"community01","community02","community03","community04","community05"};
		initSampleData.setIds(ids);
		String[] pws = {"1000com","2000com","3000com","4000com","5000com"};
		initSampleData.setPws(pws);
		String[] names = {"elsa","anna","moana","belle","ariel"};
		initSampleData.setNames(names);
		String[] births = {"171222","200621","161123","040320","230524"};
		initSampleData.setBirths(births);
		String[] phones = {"01012345678","01045678910","01078910123","01032165498","01065498721"};
		initSampleData.setPhones(phones);
		String[] programs = {"기타초급","서예교실","서양화그리기","동양화그리기","영어회화"};	
		initSampleData.setPrograms(programs);
		String[] startDates = {"2024/3/5","2024/3/5","2024/3/5","2024/3/5","2024/3/5"};
		initSampleData.setStartDates(startDates);
		
		return initSampleData;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}	
	@Bean
	public MemberAllSelect memberAllSelect() {
		return new MemberAllSelect();
	}	
	@Bean
	public MemberDelete memberDelete() {
		return new MemberDelete();
	}
	@Bean
	public MemberModify memberModify() {
		return new MemberModify();
	}
	@Bean
	public MemberRegister memberRegister() {
		return new MemberRegister();
	}
	@Bean
	public MemberSelect memberSelect() {
		return new MemberSelect();
	}
	@Bean
	public PrintMemberInformation printMemberInformation() {
		return new PrintMemberInformation();
	}
}






















