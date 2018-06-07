package com.orm.relation.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Laptop")

public class Laptop implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Id
	
	@GenericGenerator(name="lid" , strategy="increment")
	@GeneratedValue(generator="lid")
	
	

	private int lid;
	private String lName;
	@ManyToOne(cascade = CascadeType.ALL)
	
	private Student stu;
	
	
	
	public Laptop() {
		
		System.out.println(this.getClass().getSimpleName()+" created");
	}



	public int getLid() {
		return lid;
	}



	public void setLid(int lid) {
		this.lid = lid;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	

}
