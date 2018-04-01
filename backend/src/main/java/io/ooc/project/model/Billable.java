package io.ooc.project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Billable")
public class Billable implements Serializable{
	
	@Id
	@Column(name="billableId")
	@GeneratedValue
	private Integer billableId;

	@Column(name="billableName")
	private String billableName;
	
	@Column(name="billableAddress")
	private String billableAddress;
	/*
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	*/
	
	//------------------------------------------------Billable mapped to User-------------------------------------------//
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name="UserBillable",
			joinColumns = @JoinColumn(name = "BILLABLE_ID"),
			inverseJoinColumns = @JoinColumn(name="USER_ID")
	)
	private User user;
	//-------------------------------------------------------------------------------------------------------------------//
	
	
	/*
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name = "BillableItem",
			joinColumns = @JoinColumn(name="BILLABLE_ID"),
			inverseJoinColumns = @JoinColumn(name="ITEM_ID")
	)
	public Set<Item> item;
	
	*/
	
	
	
	//--------------------------Billable mapped to item---------------------------------------------//
	
	/*
	@OneToMany(mappedBy="Billable",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Item> item;
	*/
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name = "BillableItem",
			joinColumns = @JoinColumn(name="BILLABLE_ID"),
			inverseJoinColumns = @JoinColumn(name="ITEM_ID")
	)
	public Set<Item> item;
	//----------------------------------------------------------------------------------------------//
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}
	
	public Integer getBillableId() {
		return billableId;
	}

	public void setBillableId(Integer billableId) {
		this.billableId = billableId;
	}

	public String getBillableName() {
		return billableName;
	}

	public void setBillableName(String billableName) {
		this.billableName = billableName;
	}

	public String getBillableAddress() {
		return billableAddress;
	}

	public void setBillableAddress(String billableAddress) {
		this.billableAddress = billableAddress;
	}
	
}
