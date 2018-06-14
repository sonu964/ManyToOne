package com.game.players.onetomany.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.game.players.onetomany.DTO.GameDto;
import com.singleton.util.SingletonFactory;

public class GameDao {
	
	public void saveXX(GameDto gdto){
		
		System.out.println("save() started");
		
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		try{
			
			Transaction tx = session.beginTransaction();
			
			session.save(gdto);
			tx.commit();
			
			
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
			
		}
		
		System.out.println("save() ended");
	}

}
