package kr.or.kosta.contact.service;

import java.util.List;

import kr.or.kosta.contact.model.Contact;

public interface ContactAdminService {

	void registContact(Contact contact);
	
	Contact searchContactById(int id);
	
	List<Contact> getAllContact();
}
