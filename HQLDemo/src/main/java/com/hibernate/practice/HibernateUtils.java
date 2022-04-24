package com.hibernate.practice;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry standardServiceRegistry;
	
	public HibernateUtils(){}
	static
	{
		try
		{
			standardServiceRegistry = new StandardServiceRegistryBuilder().configure("com/hibernate/practice/hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	

}
