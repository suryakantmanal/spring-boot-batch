package com.test.surya.hibernateAnnotationOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestOneToOneAnnotation {

	public static void main(String[] args)  {
		try{
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		
		Transaction tx = null ;
		
		
		Session session = sf.getCurrentSession();
		
		tx = session.beginTransaction();
		Student s1 = new Student();
		s1.setName("ss name");
		Address address = new Address();
		address.setAdd1("Noida");
		s1.setAddress(address);
		
		session.save(s1);
		
		tx.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
