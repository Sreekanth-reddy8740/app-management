package org.sreekanth.app_management.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sreekanth.app_management.entity.AppEntity;

public class SessionFactoryUtil {

	private static SessionFactory sessionfactory=null;
	
	public static SessionFactory getSessiionFactory() {
		
		if(sessionfactory==null) {
			
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(AppEntity.class);
			sessionfactory = cfg.buildSessionFactory();
		}
		return sessionfactory;
		
	}
}
