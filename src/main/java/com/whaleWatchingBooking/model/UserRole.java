package com.whaleWatchingBooking.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "user_role")
public class UserRole {
	
	@Id
	@Column(name="role_id")
	private long roleId;
	
	@Column(name="description")
	private String description;	
	
	@Column(name="ent_user")
	private String entUser;	
	
	@Column(name="mod_user")
	private String modUser;
	
	@Column(name="ent_date")
	private Date entDate;
	
	@Column(name="mod_date")
	private Date modDate;
	 	
	
	public Date getEntDate() {
		return entDate;
	}
	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEntUser() {
		return entUser;
	}
	public void setEntUser(String entUser) {
		this.entUser = entUser;
	}
	public String getModUser() {
		return modUser;
	}
	public void setModUser(String modUser) {
		this.modUser = modUser;
	}
	
	

}
