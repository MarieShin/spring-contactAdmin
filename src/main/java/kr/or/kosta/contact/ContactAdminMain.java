package kr.or.kosta.contact;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.contact.model.Contact;
import kr.or.kosta.contact.service.MysqlContactAdminService;

public class ContactAdminMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		MysqlContactAdminService service = context.getBean("contactAdminService", MysqlContactAdminService.class);

		service.registContact(new Contact());

		Contact contact = service.searchContactById(1);
		System.out.println(contact);

		List<Contact> list = service.getAllContact();
		for (Contact item : list) {
			System.out.println(item);
		}

	}
}
