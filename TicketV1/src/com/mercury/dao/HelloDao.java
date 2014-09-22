package com.mercury.dao;

import java.util.List;

import com.mercury.beans.Ticket;

public interface HelloDao {
	public Ticket findByName(String name);
	public void save(Ticket ticket);
	public void update(Ticket ticket);
	public void delete(Ticket ticket);
	public List<Ticket> queryAll();
}
