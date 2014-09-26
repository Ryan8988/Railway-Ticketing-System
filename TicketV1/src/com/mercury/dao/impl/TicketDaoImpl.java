package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.beans.Ticket;
import com.mercury.dao.TicketDao;

public class TicketDaoImpl implements TicketDao {
	private HibernateTemplate template;
	public void setSessionFactory(SessionFactory sessionFactory){
		template = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void save(Ticket ticket) {
		// TODO Auto-generated method stub
		template.save(ticket);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> query() {
		// TODO Auto-generated method stub
		String hql="from Ticket";
		return template.find(hql);
	}

	@Override
	public void delete(Ticket ticket) {
		// TODO Auto-generated method stub
		template.delete(ticket);
	}

	@Override
	public void update(Ticket ticket) {
		// TODO Auto-generated method stub
		template.update(ticket);
	}

}
