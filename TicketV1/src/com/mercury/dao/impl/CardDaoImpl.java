package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.beans.Card;
import com.mercury.dao.CardDao;

public class CardDaoImpl implements CardDao {
	private HibernateTemplate template;
	public void setSessionFactory(SessionFactory sessionFactory){
		template = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void save(Card card) {
		// TODO Auto-generated method stub
		template.save(card);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Card> cardQuery() {
		// TODO Auto-generated method stub
		String hql="from Card";
		return template.find(hql);
	}

	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub
		template.delete(card);
	}

	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub
		template.update(card);
	}

	@Override
	public Card findByCardNum(int number) {
		// TODO Auto-generated method stub
		return (Card)template.load(Card.class, number);
	}

}
