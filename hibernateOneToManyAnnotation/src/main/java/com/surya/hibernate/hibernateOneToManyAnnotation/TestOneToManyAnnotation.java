package com.surya.hibernate.hibernateOneToManyAnnotation;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestOneToManyAnnotation {

	public static void main(String[] args)  {
		try{
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);
		
		Transaction tx = null ;
		
		
		Session session = sf.openSession();
		
		tx = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("new employee");
		
		Department d1 = new Department();
		d1.setName("CS");
		
		Department d2 = new Department();
		d2.setName("IT");
		
		Set<Department> deps = new HashSet<Department>();
		
		deps.add(d1);
		deps.add(d2);
		
		e1.setDepartments(deps);
		
		session.save(e1);
		
		tx.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
