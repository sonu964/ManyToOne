package com.game.players.onetomany.DTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Game")
public class GameDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	
	@GenericGenerator(name="gid" , strategy="increment")
	@GeneratedValue(generator="gid")
	
	@Column(name="gid")
	private int gid;
	
	@Column(name="gName")
	private String gName;
	
	@Column(name="gType")
	private String gType;
	
	@Column(name="duration")
	private int duration;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="g_id")
	List<PlayerDto> playerList;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgType() {
		return gType;
	}
	public void setgType(String gType) {
		this.gType = gType;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<PlayerDto> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<PlayerDto> playerList) {
		this.playerList = playerList;
	}
	
	public GameDto() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

}
