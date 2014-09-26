package com.mercury.dao.impl;
//
//import java.util.List;
//
//import org.hibernate.SessionFactory;
//import org.springframework.orm.hibernate3.HibernateTemplate;
//
//import com.mercury.beans.Card;
//import com.mercury.beans.Users;
//
//public class HelloDaoImpl implements HelloDao {
//	private HibernateTemplate template;
//	public void setSessionFactory(SessionFactory sessionFactory){
//		template = new HibernateTemplate(sessionFactory);
//	}
//	@Override
//	public void save(Users users) {
//		// TODO Auto-generated method stub
//		template.save(users);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Users> usersQuery() {
//		// TODO Auto-generated method stub
//		String hql="from Users";
//		return template.find(hql);
//	}
//
//	@Override
//	public void delete(Users users) {
//		// TODO Auto-generated method stub
//		template.delete(users);
//	}
//
//	@Override
//	public void update(Users users) {
//		// TODO Auto-generated method stub
//		template.update(users);
//	}
//
//	@Override
//	public Users findByUserName(String name) {
//		// TODO Auto-generated method stub
//		return (Users)template.load(Users.class, name);
//	}
//}
