package com.mercury.dao;

import java.util.List;

import com.mercury.beans.Ticket;

public interface TicketDao {
	public void save(Ticket ticket);
	public List<Ticket> query();
	public void delete(Ticket ticket);
	public void update(Ticket ticket);
}
