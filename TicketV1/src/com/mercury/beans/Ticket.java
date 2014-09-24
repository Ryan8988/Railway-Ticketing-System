package com.mercury.beans;
import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	@GeneratedValue
	@Column(name="ticket_id")
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="origin")
	private String origin;
	@Column(name="destination")
	private String destination;
	@Column(name="depart_time")
	private Timestamp depart_time;
	@Column(name="arrive_time")
	private Timestamp arrive_time;
	@Column(name="price")
	private int price;
	@Column(name="quantity")
	private int quantity;
	public Ticket(){}
	public Ticket(int id,String type,String origin,String destination,Timestamp depart_time,
			Timestamp arrive_time,int price,int quantity){
		this.id=id;
		this.type=type;
		this.origin=origin;
		this.destination=destination;
		this.depart_time=depart_time;
		this.arrive_time=arrive_time;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Timestamp getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(Timestamp depart_time) {
		this.depart_time = depart_time;
	}
	public Timestamp getArrive_time() {
		return arrive_time;
	}
	public void setArrive_time(Timestamp arrive_time) {
		this.arrive_time = arrive_time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString(){
		return id+"\t"+type+"\t"+price;
	}
}
