package com.mercury.dao;

import java.util.List;

import com.mercury.beans.Users;

public interface UsersDao {
	public void save(Users users);
	public List<Users> usersQuery();
	public void delete(Users users);
	public void update(Users users);
	public Users findByUserName(String name);	
}
