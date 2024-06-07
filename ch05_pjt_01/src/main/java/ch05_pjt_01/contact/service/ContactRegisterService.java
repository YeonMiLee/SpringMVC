package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactRegisterService {
	
	@Autowired //일반적으로 필드에 많이 사용(가장 간단하고 직관적인 방법)
	private ContactDao contactDao;
	
//	public ContactRegisterService() {
//		System.out.println("default constructor");
//	}
	
//	@Autowired
//	public ContactRegisterService(ContactDao contactDao) {
//		System.out.println("contactDao: " + contactDao);		//contactDao 출력
//		this.contactDao = contactDao;
//	}
	
	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		if(verify(name)) {
			contactDao.insert(contactSet);
		} else {
			System.out.println("The name has already registered.");
		}
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null ? true : false;
	}

//	@Autowired
//	public void setWordDao(ContactDao contactDao) {
//		this.contactDao = contactDao;
//	}
}
