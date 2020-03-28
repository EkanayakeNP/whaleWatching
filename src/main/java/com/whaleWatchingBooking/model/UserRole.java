package com.whaleWatchingBooking.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "user_role",schema = "whale_watching")
public class UserRole {
	
	@Id
	@Column(name="roleId")
	private String roleId;
	@Column(name="description")
	private String description;	
	@Column(name="ent_user")
	private String entUser;	
	@Column(name="mod_user")
	private String modUser;
	
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
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
