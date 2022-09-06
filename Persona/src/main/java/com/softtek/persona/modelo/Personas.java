package com.softtek.persona.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Personas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "person_seq", allocationSize = 1, name = "CUST_SEQ")
	Long person_id;
	
	@Column(name="FIRST_NAME")
	String first_name;
	String last_name;
	
	public Long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Long person_id) {
		this.person_id = person_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	
	public Personas() {
		
	}
	

	public Personas(Long person_id, String first_name, String last_name) {
	this.person_id = person_id;
	this.first_name = first_name;
	this.last_name = last_name;
}
	@Override
	public String toString() {
		return "Personas [person_id=	" + person_id + ",	first_name=	" + first_name + ",	last_name=	" + last_name + "]";
	}
	



}
