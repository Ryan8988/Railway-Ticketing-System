package com.mercury.service;


import com.mercury.beans.Users;
import com.mercury.beans.UsersInfo;
import com.mercury.dao.UsersDao;

public class UsersService {
	private UsersDao useDao;
	
	public UsersDao getUseDao() {
		return useDao;
	}
	public void setUseDao(UsersDao useDao) {
		this.useDao = useDao;
	}

	public UsersInfo process(Users users) {
		useDao.save(users);
		UsersInfo usersInfo = new UsersInfo();
		usersInfo.setMsg("Hello " + users.getUsername() + ", welcome to JavaEE!");
		usersInfo.setUser(useDao.usersQuery());
		
//		List<Station> list=new ArrayList<Station>();
//		list.add(station);
//		list.add(station);
//		stationInfo.setStations(list);
		return usersInfo;
	}
}
