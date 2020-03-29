package com.whaleWatchingBooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="available_dates")
public class AvailableDates {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="is_available")
	private String isAvailable;
	
	@Column(name="ent_user")
	private String entUser;
	
	@Column(name="ent_date")
	private Date entDate;
	
	@Column(name="mod_user")
	private String modUser;
	
	@Column(name="mod_date")
	private Date modDate;
	
	@Column(name="seats_id")
	private int seatsId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getEntUser() {
		return entUser;
	}
	public void setEntUser(String entUser) {
		this.entUser = entUser;
	}
	public Date getEntDate() {
		return entDate;
	}
	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}
	public String getModUser() {
		return modUser;
	}
	public void setModUser(String modUser) {
		this.modUser = modUser;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public int getSeatsId() {
		return seatsId;
	}
	public void setSeatsId(int seatsId) {
		this.seatsId = seatsId;
	}
	
	
	
}
