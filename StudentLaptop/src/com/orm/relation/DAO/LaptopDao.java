package com.orm.relation.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.relation.DTO.Laptop;
import com.singlton.sessionfactory.SingletonFactory;

public class LaptopDao {
	
	public void saveLaptop(Laptop list){
		
		System.out.println("saveLaptop() method started");
		
		SessionFactory factory = SingletonFactory.getSessionFactory();
		
		
		Session session = factory.openSession();
		
		try{
			
			Transaction tx = session.beginTransaction();
			session.save(list);
			tx.commit();
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			
			session.close();
		}
		
		System.out.println("saveLaptop() method ended");
	}

}
