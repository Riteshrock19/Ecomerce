package com.ecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brandtab")
public class Brand {
   @Id
   
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name="brnd_id_col")
	private Long id;
	
   @Column(name="brnd_name_col")
	private String name;
	
   @Column(name="brnd_code_col")
	private String code;
	
   @Column(name="brnd_tagline_col")
	private String tagLine;
	
   @Column(name="brnd_image_col")
	private String imageLink;
	
   @Column(name="brnd_note_col")
	private String note;

public Brand(Long id, String name, String code, String tagLine, String imageLink, String note) {
	super();
	this.id = id;
	this.name = name;
	this.code = code;
	this.tagLine = tagLine;
	this.imageLink = imageLink;
	this.note = note;
}

public Brand() {
	super();
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

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getTagLine() {
	return tagLine;
}

public void setTagLine(String tagLine) {
	this.tagLine = tagLine;
}

public String getImageLink() {
	return imageLink;
}

public void setImageLink(String imageLink) {
	this.imageLink = imageLink;
}

public String getNote() {
	return note;
}

public void setNote(String note) {
	this.note = note;
}
	
	
}
