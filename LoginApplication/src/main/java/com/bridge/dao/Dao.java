package com.bridge.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridge.pojo.Emplloyee;

public class Dao 
{
	 ArrayList employeelist = new ArrayList();
	public ArrayList display() {
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	     Session session=factory.openSession();
	     Transaction transaction = session.beginTransaction();
	     
		  Query query = session.createQuery("FROM com.bridge.pojo.Emplloyee"); 
		  employeelist = (ArrayList) query.list();
		 
	  
		session.close();
		return employeelist;
	}
	
	
 public boolean saveDetails(int id, String name, int salary)
{
   boolean flag=true;
   SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session session=factory.openSession();
      
     Emplloyee emp = new Emplloyee();
     emp.setId(id); 
     emp.setName(name);
     emp.setSalary(salary);
    
     
     Transaction transaction = session.beginTransaction();
     try
     {
         session.save(emp);
         Emplloyee empolyee = (Emplloyee)session.get(Emplloyee.class, id);
         System.out.println(empolyee);
			
			  
			 
		 System.out.println("Shubham ");
         transaction.commit();
     }catch(Exception e)
     {
         transaction.rollback();
         flag=false;
     }
     session.close();
     return flag;
     }
}