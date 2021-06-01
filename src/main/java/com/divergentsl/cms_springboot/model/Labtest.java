package com.divergentsl.cms_springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "labtest")
public class Labtest {
	
	private String name;
	@Id
	private String labtest_id;
	private String labtest_price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Labtest [name=" + name + ", labtest_id=" + labtest_id + ", labtest_price=" + labtest_price + "]";
	}
	public String getLabtest_id() {
		return labtest_id;
	}
	public void setLabtest_id(String labtest_id) {
		this.labtest_id = labtest_id;
	}
	public String getLabtest_price() {
		return labtest_price;
	}
	public void setLabtest_price(String labtest_price) {
		this.labtest_price = labtest_price;
	}
	
	
	

}
