package com.game.players.onetomany.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Player")
public class PlayerDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	@Id
	
	@GenericGenerator(name="pid" , strategy="increment")
	@GeneratedValue(generator="pid")
	
	@Column(name="pid")
	private int pid;
	
	@Column(name="pName")
	private String pName;
	
	@Column(name="pAge")
	private int pAge;
	
	@Column(name="pGender")
	private String pGender;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public String getpGender() {
		return pGender;
	}
	public void setpGender(String pGender) {
		this.pGender = pGender;
	}
	
	public PlayerDto() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
}
