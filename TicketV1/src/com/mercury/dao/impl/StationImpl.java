package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.mercury.beans.Station;
import com.mercury.dao.StationDao;

public class StationImpl implements StationDao {
	private HibernateTemplate template;
	public void setSessionFactory(SessionFactory sessionFactory){
		template = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void save(Station station) {
		// TODO Auto-generated method stub
		template.save(station);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Station> query() {
		// TODO Auto-generated method stub
		String hql="from Station";
		return template.find(hql);
	}

	@Override
	public void delete(Station station) {
		// TODO Auto-generated method stub
		template.delete(station);
	}

	@Override
	public void update(Station station) {
		// TODO Auto-generated method stub
		template.update(station);
	}

	@Override
	public Station findByStationName(String stationName) {
		// TODO Auto-generated method stub
		return (Station)template.load(Station.class, stationName);
	}

}
