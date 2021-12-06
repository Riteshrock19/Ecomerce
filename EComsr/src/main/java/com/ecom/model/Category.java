package com.ecom.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="category_tab")
public class Category {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="cat_name_col")
  private String name;
  
  @Column(name="cat_alias_col")
  private String alias;
  
  @Column(name="cat_status_col")
  private String status;
  
  @Column(name="cat_note_col")
  private String note;
  
  @ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="cat_type_fk_col")
	private CategoryType categoryType;

public CategoryType getCategoryType() {
	return categoryType;
}

public void setCategoryType(CategoryType categoryType) {
	this.categoryType = categoryType;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAlias() {
	return alias;
}

public void setAlias(String alias) {
	this.alias = alias;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getNote() {
	return note;
}

public void setNote(String note) {
	this.note = note;
}



public Category(Long id, String name, String alias, String status, String note, CategoryType categoryType) {
	super();
	this.id = id;
	this.name = name;
	this.alias = alias;
	this.status = status;
	this.note = note;
	this.categoryType = categoryType;
}

public Category() {
	super();
}
  
}
