package com.hzit.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
	private static SessionFactory factory = null;

	private HBUtil() {
	}

	public static SessionFactory getFactory() {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
			System.out.println("factory="+factory);
		}
		return factory;
	}

	public static Session getCurrentSession() {
		return getFactory().getCurrentSession();
	}

	public static Session getOpenSession() {
		return getFactory().openSession();
	}
}
