package com.mercury.beans;

public class Cart {
	private int user_id;
	private int ticket_id;
	private int quantity;
	private int cart_id;
	public Cart(){}
	public Cart(int user_id,int ticket_id,int quantity,int cart_id){
		this.user_id=user_id;
		this.ticket_id=ticket_id;
		this.quantity=quantity;
		this.cart_id=cart_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	
}
