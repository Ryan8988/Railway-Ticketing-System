package com.mercury.beans;

import javax.persistence.*;


@Entity
@Table(name="station")
public class Station {
	@Id
	@Column(name="station_name")
	private String name;
	@Column(name="station_id")
	private int st_id;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	public Station(){};
	public Station(String name,int st_id,String city,String state){
		this.name=name;
		this.st_id=st_id;
		this.city=city;
		this.state=state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
