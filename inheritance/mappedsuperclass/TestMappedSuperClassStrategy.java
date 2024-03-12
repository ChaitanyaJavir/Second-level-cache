package com.prowings.inheritance.mappedsuperclass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

public class TestMappedSuperClassStrategy 
{
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		MyEmployee employee = new MyEmployee("Ram", "IT", 5, 55);
		MyWorker worker = new MyWorker("123434$", "Manager", 6, 65);
		
		session.save(employee);
		session.save(worker);
		
		transaction.commit();
		session.close();
		
		sessionFactory.close();
		
		
	}

}
