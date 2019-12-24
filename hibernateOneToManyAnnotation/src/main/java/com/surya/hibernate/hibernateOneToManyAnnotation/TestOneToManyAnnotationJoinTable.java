package com.surya.hibernate.hibernateOneToManyAnnotation;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestOneToManyAnnotationJoinTable {

	public static void main(String[] args)  {
		try{
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		
		Transaction tx = null ;
		
		
		Session session = sf.openSession();
		
		tx = session.beginTransaction();
		Student s1 = new Student();
		s1.setName("ss name");
		Account account = new Account();
		account.setAccountNo("123");
		
		Account account1 = new Account();
		account1.setAccountNo("456");
		
		Set<Account> accounts = new HashSet<Account>();
		accounts.add(account);
		accounts.add(account1);
		
		s1.setAccounts(accounts);
		
		session.save(s1);
		
		tx.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
