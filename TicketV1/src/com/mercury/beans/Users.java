package com.mercury.beans;



import java.util.HashSet;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "Users")
public class Users {
	
	private int user_id;	
	private String username;	
	private String password;
	private String first_name;
	private String last_name;	
	private String email;	
	private String address;	
	private int authority;	
	private int enabled;	
	private Set<Card> cards = new HashSet<Card>();
	private Set<Transactions> transactions=new HashSet<Transactions>();
	
	
	public Users(){}
	public Users(String name,String password,String firstName,String lastName,String email,String address,
			int authority,int enabled){
		this.username = name;
		this.password = password;
		this.first_name = firstName;
		this.last_name = lastName;
		this.email = email;
		this.address = address;
		this.authority = authority;
		this.enabled = enabled;		
	}
	@Id
	@GenericGenerator(name="generator",strategy="increment")
	@GeneratedValue(generator="generator")
	@Column(name="user_id",unique=true,nullable=false)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="first_name")
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	@Column(name="last_name")
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="authority")
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	
	@Column(name="enabled")
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="users")	
	public Set<Card> getCards() {
		return cards;
	}
	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}
	@OneToMany(fetch=FetchType.LAZY,mappedBy="users")
	public Set<Transactions> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<Transactions> transactions) {
		this.transactions = transactions;
	}
	
	
	
}
	

