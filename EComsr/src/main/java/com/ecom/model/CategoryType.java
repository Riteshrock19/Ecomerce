package com.ecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorytype_tab")
public class CategoryType {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 
 @Column(name="cat_type_name_col")
 private String name;
 
 @Column(name="cat_type_note_col")
 private String note;

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

public String getNote() {
	return note;
}

public void setNote(String note) {
	this.note = note;
}

public CategoryType(Long id, String name, String note) {
	super();
	this.id = id;
	this.name = name;
	this.note = note;
}
 
 public CategoryType() {
	 super();
 }
 
}
