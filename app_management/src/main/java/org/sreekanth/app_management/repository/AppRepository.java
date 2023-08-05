package org.sreekanth.app_management.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.sreekanth.app_management.Util.ConnectionPropertiesUtil;
import org.sreekanth.app_management.Util.SessionFactoryUtil;
import org.sreekanth.app_management.dto.AppDto;
import org.sreekanth.app_management.entity.AppEntity;

public class AppRepository {

	public void saveOrUpdate(AppEntity userEntity) {
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		cfg.addAnnotatedClass(AppEntity.class);	
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessiionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
	}
	
	public AppEntity findById(long id) {
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		cfg.addAnnotatedClass(AppEntity.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		SessionFactory sessiionFactory = SessionFactoryUtil.getSessiionFactory();
		Session session = sessiionFactory.openSession();
		return session.get(AppEntity.class, id);
	}
	
	public void update(AppDto appDto) {
		
		AppEntity appEntity=findById(appDto.getAltkey());
		if(appEntity!=null) {
			
			appEntity.setCreatedBy(appDto.getCreatedBy());
			appEntity.setStatus(appDto.getStatus());
			appEntity.setServiceName(appDto.getServiceName());
			appEntity.setModifieBy(appDto.getModifieBy());
			saveOrUpdate(appEntity);
		}
	}
	
}
