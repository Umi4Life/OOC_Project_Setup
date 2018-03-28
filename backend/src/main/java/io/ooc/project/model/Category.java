package io.ooc.project.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="category")
public class Category implements Serializable{
	
	@Id
	@Column(name="categoryId")
	@GeneratedValue
	private Integer categoryId;
	
	@Column(name="categoryName")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(
			name="CategoryItem",
			joinColumns = @JoinColumn(name="CATEGORY_ID"),
			inverseJoinColumns = @JoinColumn(name="ITEM_ID")
	)
	public Set<Item> item;
	
	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}

}

