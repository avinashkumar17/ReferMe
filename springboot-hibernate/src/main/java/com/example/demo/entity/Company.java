package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int compid;

public int getCompid() {
	return compid;
}

public void setCompid(int compid) {
	this.compid = compid;
}

public String getComp_name() {
	return comp_name;
}

public void setComp_name(String comp_name) {
	this.comp_name = comp_name;
}

private String comp_name;
	
}
