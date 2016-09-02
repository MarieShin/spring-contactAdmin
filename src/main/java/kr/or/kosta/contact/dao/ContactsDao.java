package kr.or.kosta.contact.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.contact.model.Contact;

/**
 * cotacts 테이블을 데이터를 조작하는 메소드가 위치
 *  C .. 데이터 삽입 
 *  R .. 데이터 검색 (전체보기) 
 *  U .. 데이터 업데이트
 * 	D .. 데이터 삭제
 * 
 * @author kosta
 *
 */

@Repository("contctDao")
public class ContactsDao {

	@Autowired
	private DataSource dataSource;

	public void insertContact(Contact contact) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println("connection borrowed..");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("connection released..");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public Contact selectContactById(int id) {
		System.out.println("search ok..");
		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("marie");
		contact.setEmail("marie@gmail.com");
		contact.setAge(25);
		contact.setAddr("Incheon");
		return contact;
	}

	public List<Contact> selectAll() {
		System.out.println("read all..");
		List<Contact> contactList = new ArrayList<Contact>();

		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("marie");
		contact.setEmail("marie@gmail.com");
		contact.setAge(25);
		contact.setAddr("Incheon");
		contactList.add(contact);

		contact = new Contact();
		contact.setId(2);
		contact.setName("paul");
		contact.setEmail("paul123@gmail.com");
		contact.setAge(33);
		contact.setAddr("USA");
		contactList.add(contact);

		contact = new Contact();
		contact.setId(3);
		contact.setName("kim");
		contact.setEmail("kim35@gmail.com");
		contact.setAge(35);
		contact.setAddr("Seoul");
		contactList.add(contact);

		return contactList;
	}

}
