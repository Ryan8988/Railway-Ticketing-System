package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.beans.Station;
import com.mercury.dao.StationDao;

public class StationDaoImpl implements StationDao{
	private HibernateTemplate template;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		template = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public Station findByStationName(String name) {
		// TODO Auto-generated method stub
		return (Station)template.load(Station.class, name);
	}

	@Override
	public void save(Station Station) {
		// TODO Auto-generated method stub
		template.save(Station);
	}

	@Override
	public void update(Station Station) {
		// TODO Auto-generated method stub
		template.update(Station);
	}

	@Override
	public void delete(Station Station) {
		// TODO Auto-generated method stub
		template.delete(Station);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Station> query() {
		// TODO Auto-generated method stub
		String hql = "from Station";
		return template.find(hql);

	}

}
