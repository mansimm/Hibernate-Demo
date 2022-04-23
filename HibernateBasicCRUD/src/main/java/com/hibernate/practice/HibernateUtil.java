package com.hibernate.practice;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	private static StandardServiceRegistry standardServiceRegistry;
	
	private HibernateUtil() {}
	static
	{
		try
		{
			standardServiceRegistry = new StandardServiceRegistryBuilder()
					.configure("com/hibernate/practice/hibernate.cfg.xml").build();
			
			Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
			
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		catch (Exception ex) {
			   System.out.println("Initial SessionFactory creation failed. " + ex);
			   throw new ExceptionInInitializerError(ex);
		}
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
