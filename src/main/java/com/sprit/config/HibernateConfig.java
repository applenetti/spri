package com.sprit.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.spri.model.Person;


public class HibernateConfig {

	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new AnnotationConfiguration()
			.configure()
			.addAnnotatedClass(Person.class)
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
