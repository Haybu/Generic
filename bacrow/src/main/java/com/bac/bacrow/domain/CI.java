package com.bac.bacrow.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name="T_CI")
public class CI implements java.io.Serializable{
	
	@Id
	@GeneratedValue
	int id;
	
	@NotNull
	@Size(min=1, max=20)
	String cinum;
	
	String label;	
	String location;
	String type;
	
	public CI(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCinum() {
		return cinum;
	}
	public void setCinum(String cinum) {
		this.cinum = cinum;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}