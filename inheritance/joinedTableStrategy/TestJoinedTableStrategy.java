package com.prowings.inheritance.joinedTableStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

public class TestJoinedTableStrategy 
{
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Pet pet = new Pet("cat", "julie", 12);
		WildAnimals wildAnimals = new WildAnimals("dog", "rogger");
		
		session.save(pet);
		session.save(wildAnimals);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
