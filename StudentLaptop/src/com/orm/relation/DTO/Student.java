package com.orm.relation.DTO;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Student")
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	
	@GenericGenerator(name="sid" , strategy="increment")
	@GeneratedValue(generator="sid")
	
	
	private int rollno;
	private String name;
	private int marks;
	
	@OneToMany(mappedBy="stu")
	
	private List<Laptop> lapList ;
	
	
	
	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}

	


	public List<Laptop> getLapList() {
		return lapList;
	}

	public void setLapList(List<Laptop> lapList) {
		this.lapList = lapList;
	}



	public Student() {
		
		System.out.println(this.getClass().getSimpleName()+" created");
	}

}
