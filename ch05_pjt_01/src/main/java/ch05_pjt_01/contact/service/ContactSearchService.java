package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactSearchService {
	
	@Autowired	//일반적으로 필드에 많이 사용(가장 간단하고 직관적인 방법)
	private ContactDao contactDao;
	
//	public ContactSearchService() {
//		System.out.println("default constructor");
//	}
	
//	@Autowired
//	public ContactSearchService(ContactDao contactDao) {
//		System.out.println("contactDao: " + contactDao);		//contactDao 출력
//		this.contactDao = contactDao;
//	}
	
	public ContactSet searchContact(String name) {
		if(verify(name)) {
			return contactDao.select(name);
		} else {
			System.out.println("Contact information is  available.");
		}
		return null;
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null ? true : false;
	}
	
//	@Autowired
//	public void setContactDao(ContactDao contactDao) {
//		this.contactDao = contactDao;
//	}

}
