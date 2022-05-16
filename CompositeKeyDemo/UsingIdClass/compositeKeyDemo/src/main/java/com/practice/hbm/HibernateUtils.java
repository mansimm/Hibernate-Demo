package com.practice.hbm;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	private static final StandardServiceRegistry standardServiceRegistry;
	
	public HibernateUtils(){}
	static
	{
		standardServiceRegistry = new StandardServiceRegistryBuilder().configure("com/practice/hbm/hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
		
	}
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	

}
