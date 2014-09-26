package com.mercury.beans;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="transaction")
public class Transactions {
	private int transId;
	private Users users;
	private Ticket ticket;
	private int quantity;
	private double total;
	private Timestamp orderTime;
	
	public Transactions(){}
	public Transactions(Users users, Ticket ticket, int quantity, double total,Timestamp orderTime){
		this.users = users;
		this.ticket = ticket;
		this.quantity = quantity;
		this.total = total;
		this.orderTime = orderTime;
	}
	@Id
	@GenericGenerator(name="generator",strategy="increment")
	@GeneratedValue(generator="generator")
	@Column(name="transaction_id",unique=true,nullable=false)
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false)
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ticket_id",nullable=false)
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Column(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Column(name="total")
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Column(name="order_time")
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
}
