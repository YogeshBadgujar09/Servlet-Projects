package com.yogesh.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonDesignPattern {
	
	private static SessionFactory sessionFactory ;
	private static Configuration configuration ;
	
	public SingletonDesignPattern() {}
		
	public static SessionFactory getSessionFactoryInstance() {
		
		if(sessionFactory == null) {
			configuration = new Configuration();
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();	
		}

		return sessionFactory;
	}
	
}
