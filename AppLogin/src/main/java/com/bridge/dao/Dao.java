package com.bridge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridge.pojo.Student;

public class Dao {
	SessionFactory factory;
	Session session;
	@SuppressWarnings("deprecation")
	public Dao() {
		 factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
	}
	
	/*Method to check a user is valid or not*/
	public boolean validate(String userName, String passWord) {
		
		 session = factory.openSession();
		 Transaction transaction = session.beginTransaction();
		 Student std = (Student) session.get(Student.class, userName);
		 if(std == null) {
			 return false;
		 }else {
			 if(passWord.equals(std.getPassWord())){
				 return true;
			 }
		 }
		 transaction.commit();
		 session.close();
		return false;
	}
	
	
	/*Method to register a student in database*/
	public void register(Student st) {
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(st);
		transaction.commit();
		session.close();
	}

	public void setPassword(String userName) {
		
	}

}
