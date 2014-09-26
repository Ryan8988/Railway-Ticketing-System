package com.mercury.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import com.mercury.beans.Transactions;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ticket")
public class Ticket {
	private int ticketId;
	private String type;
	private Timestamp departTime;
	private Timestamp arriveTime;
	private double price;
	private int quantity;
	private int origin;
	private int destination;
	private Set<Transactions>transactions = new HashSet<Transactions>();
	public Ticket(){}
	public Ticket(String type,Timestamp departTime,Timestamp arriveTime, double price, int quantity,int origin,int destination){		
		this.type = type;
		this.departTime = departTime;
		this.arriveTime = arriveTime;
		this.price= price;
		this.quantity = quantity;
		this.origin = origin;
		this.destination = destination;
	}
	@Id
	@GenericGenerator(name="generator",strategy="increment")
	@GeneratedValue(generator="generator")
	@Column(name="ticket_id",unique=true,nullable=false)
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	@Column(name="type",nullable=false)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="depart_time")
	public Timestamp getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Timestamp departTime) {
		this.departTime = departTime;
	}
	@Column(name="arrive_time")
	public Timestamp getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Timestamp arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	@Column(name="price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Column(name="origin")
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}	
	@Column(name="destination")
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	@OneToMany(fetch=FetchType.LAZY,mappedBy="ticket")
	public Set<Transactions> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<Transactions> transactions) {
		this.transactions = transactions;
	}
	
}
