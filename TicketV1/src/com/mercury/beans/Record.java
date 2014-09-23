package com.mercury.beans;

import java.sql.Timestamp;

public class Record {
	private int recordId;
	private int countNumber;
	private Timestamp loginTime;
	private Timestamp logoutTime;
	public Record(){}
	public Record(int recordId,int countNumber,Timestamp loginTime, Timestamp logoutTime){
		this.recordId = recordId;
		this.countNumber = countNumber;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getCountNumber() {
		return countNumber;
	}
	public void setCountNumber(int countNumber) {
		this.countNumber = countNumber;
	}
	public Timestamp getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}
	public Timestamp getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Timestamp logoutTime) {
		this.logoutTime = logoutTime;
	}
}
