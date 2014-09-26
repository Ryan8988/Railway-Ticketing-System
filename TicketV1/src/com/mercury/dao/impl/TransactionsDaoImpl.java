package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.beans.Transactions;
import com.mercury.dao.TransactionDao;

public class TransactionsDaoImpl implements TransactionDao {
	private HibernateTemplate template;
	public void setSessionFactory(SessionFactory sessionFactory){
		template = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void save(Transactions transaction) {
		// TODO Auto-generated method stub
		template.save(transaction);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transactions> query() {
		// TODO Auto-generated method stub
		String hql="from transaction";
		return template.find(hql);
	}

	@Override
	public void delete(Transactions transaction) {
		// TODO Auto-generated method stub
		template.delete(transaction);
	}

	@Override
	public void update(Transactions transaction) {
		// TODO Auto-generated method stub
		template.update(transaction);
	}

}
