package io.ooc.project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@Column(name="userId")
	@GeneratedValue
	private Integer userId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userAddress")
	private String userAddress;
	
	//----------------------------------User to role mapping------------------------------------------//
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(
			name="UserRole",
			joinColumns = @JoinColumn(name="USER_ID"),
			inverseJoinColumns = @JoinColumn(name="ROLE_ID")
	)
	private Set<Role> role;
	//--------------------------------------------------------------------------------------------------//
	
	
	
	//-----------------------------------User to Item mapping-------------------------------------------//
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(
			name="UserItem",
			joinColumns = @JoinColumn(name="USER_ID"),
			inverseJoinColumns = @JoinColumn(name="ITEM_ID")
	)
	private Set<Item> item;
	//--------------------------------------------------------------------------------------------------//
	
	
	
	//-----------------------------user Billable mapping---------------------------------------------//
	/*
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Billable> Billable;
	*/
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(
			name="UserBillable",
			joinColumns = @JoinColumn(name="USER_ID"),
			inverseJoinColumns = @JoinColumn(name="BILLABLE_ID")
	)
	private Set<Billable> Billable;
	//-------------------------------------------------------------------------------------------------//
	
	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}
	
	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}
	
	public Set<Billable> getBillable() {
		return Billable;
	}

	public void setBillable(Set<Billable> Billable) {
		this.Billable = Billable;
	}
	
}
