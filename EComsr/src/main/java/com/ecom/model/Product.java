package com.ecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_tab")
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="prod_id_col")
   private Long id;
	
   @Column(name="prod_name_col")
	private String name;
	
   @Column(name="prod_short_desc_col")
	private String shortDesc;
	
   @Column(name="prod_full_desc_col")
	private String fullDesc;
	
   @Column(name="prod_status_col")
	private String status;
	
   @Column(name="prod_stock_col")
	private String inStock;
	
   @Column(name="prod_cost_col")
	private Double cost;
	
   @Column(name="prod_len_col")
	private Double len;
	
   @Column(name="prod_wid_col")
	private Double wid;
	
   @Column(name="prod_hght_col")
	private Double height;
	
   @Column(name="prod_dim_type_col")
	private String dimType;
	
   @Column(name="prod_wght_col")
	private Double weight;
	
   @Column(name="prod_wgtype_col")
	private String wigType;
	
   @Column(name="prod_note_col")
	private String note;
	
   @ManyToOne
	@JoinColumn(name="cat_id_fk_col")
   private Category category;

public Product(Long id, String name, String shortDesc, String fullDesc, String status, String inStock, Double cost,
		Double len, Double wid, Double height, String dimType, Double weight, String wigType, String note,
		Category category) {
	super();
	this.id = id;
	this.name = name;
	this.shortDesc = shortDesc;
	this.fullDesc = fullDesc;
	this.status = status;
	this.inStock = inStock;
	this.cost = cost;
	this.len = len;
	this.wid = wid;
	this.height = height;
	this.dimType = dimType;
	this.weight = weight;
	this.wigType = wigType;
	this.note = note;
	this.category = category;
}

public Product() {
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

public String getShortDesc() {
	return shortDesc;
}

public void setShortDesc(String shortDesc) {
	this.shortDesc = shortDesc;
}

public String getFullDesc() {
	return fullDesc;
}

public void setFullDesc(String fullDesc) {
	this.fullDesc = fullDesc;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getInStock() {
	return inStock;
}

public void setInStock(String inStock) {
	this.inStock = inStock;
}

public Double getCost() {
	return cost;
}

public void setCost(Double cost) {
	this.cost = cost;
}

public Double getLen() {
	return len;
}

public void setLen(Double len) {
	this.len = len;
}

public Double getWid() {
	return wid;
}

public void setWid(Double wid) {
	this.wid = wid;
}

public Double getHeight() {
	return height;
}

public void setHeight(Double height) {
	this.height = height;
}

public String getDimType() {
	return dimType;
}

public void setDimType(String dimType) {
	this.dimType = dimType;
}

public Double getWeight() {
	return weight;
}

public void setWeight(Double weight) {
	this.weight = weight;
}

public String getWigType() {
	return wigType;
}

public void setWigType(String wigType) {
	this.wigType = wigType;
}

public String getNote() {
	return note;
}

public void setNote(String note) {
	this.note = note;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}
   
   
   
}
