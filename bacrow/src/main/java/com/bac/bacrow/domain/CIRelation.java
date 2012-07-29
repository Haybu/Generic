package com.bac.bacrow.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="T_CIRELATION")
public class CIRelation implements java.io.Serializable{
	
	@Id
	@GeneratedValue
	int id;
	
	String parentci;
	String childci;
	String relname;
	String direction;
	
	public CIRelation(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getParentci() {
		return parentci;
	}
	public void setParentci(String parentci) {
		this.parentci = parentci;
	}
	public String getChildci() {
		return childci;
	}
	public void setChildci(String childci) {
		this.childci = childci;
	}
	public String getRelname() {
		return relname;
	}
	public void setRelname(String relname) {
		this.relname = relname;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	

}
