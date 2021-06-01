package com.divergentsl.cms_springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drug")
public class Drug {
	
	@Override
	public String toString() {
		return "Drug [name=" + name + ", drug_id=" + drug_id + ", drug_price=" + drug_price + "]";
	}
	private String name;
	@Id
	private String drug_id;
	private String drug_price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDrug_id() {
		return drug_id;
	}
	public void setDrug_id(String drug_id) {
		this.drug_id = drug_id;
	}
	public String getDrug_price() {
		return drug_price;
	}
	public void setDrug_price(String drug_price) {
		this.drug_price = drug_price;
	}
	
	

}
