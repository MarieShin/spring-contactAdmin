package kr.or.kosta.contact.service;

import java.util.List;

import kr.or.kosta.contact.dao.ContactsDao;
import kr.or.kosta.contact.model.Contact;

public class MysqlContactAdminService implements ContactAdminService {

	private ContactsDao contactDao = new ContactsDao();
	
	public void setContactDao(ContactsDao dao) {
		this.contactDao = dao;
	}

	public void registContact(Contact contact) {

		contactDao.insertContact(contact);
	}

	public Contact searchContactById(int id) {
	
		return contactDao.selectContactById(id);
	}

	public List<Contact> getAllContact() {

		return contactDao.selectAll();
	}

}
