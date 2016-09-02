package kr.or.kosta.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import kr.or.kosta.contact.dao.ContactsDao;
import kr.or.kosta.contact.model.Contact;

@Service("contactAdminService")
@Scope("prototype")
public class MysqlContactAdminService implements ContactAdminService {

	@Autowired
//	private ContactsDao contactDao = new ContactsDao();
	private ContactsDao contactDao;
	
	/*public void setContactDao(ContactsDao dao) {
		this.contactDao = dao;
	}*/

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
