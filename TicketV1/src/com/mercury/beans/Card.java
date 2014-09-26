package com.mercury.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="card")
public class Card {
	private int cardId;
	private Users users;
	private int month;
	private int year;
	private int csc;
	private String type;
	
	public Card(){}
	public Card(int number,Users users, int month,int year,int csc,String type){
		this.cardId = number;
		this.users = users;
		this.month = month;
		this.year = year;
		this.csc = csc;
		this.type = type;
	}
	@Id	
	@Column(name="card_number",unique=true,nullable=false)
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false)
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
		
	@Column(name="expire_month")
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Column(name="expire_year")
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Column(name="csc")
	public int getCsc() {
		return csc;
	}
	public void setCsc(int csc) {
		this.csc = csc;
	}
	@Column(name="Type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
