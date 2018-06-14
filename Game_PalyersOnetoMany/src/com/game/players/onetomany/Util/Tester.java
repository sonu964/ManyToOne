package com.game.players.onetomany.Util;

import java.util.ArrayList;
import java.util.List;

import com.game.players.onetomany.DAO.GameDao;
import com.game.players.onetomany.DTO.GameDto;
import com.game.players.onetomany.DTO.PlayerDto;

public class Tester {

	public static void main(String[] args) {

		System.out.println("main started...");
		
		PlayerDto pdto1 = new PlayerDto();
		//pdto1.setPid(1);
		pdto1.setpName("Sonu");
		pdto1.setpAge(23);
		pdto1.setpGender("M");
		
		PlayerDto pdto2 = new PlayerDto();
	//	pdto2.setPid(2);
		pdto2.setpName("Vikas");
		pdto2.setpAge(24);
		pdto2.setpGender("M");
		
		PlayerDto pdto3 = new PlayerDto();
		//pdto3.setPid(3);
		pdto3.setpName("Shashi");
		pdto3.setpAge(25);
		pdto3.setpGender("M");
		
		PlayerDto pdto4 = new PlayerDto();
		//pdto4.setPid(4);
		pdto4.setpName("Aryan");
		pdto4.setpAge(10);
		pdto4.setpGender("M");
		
		List<PlayerDto> pList =new  ArrayList<>();
		pList.add(pdto1);
		pList.add(pdto2);
		pList.add(pdto3);
		pList.add(pdto4);
		
		GameDto gdto = new GameDto();
	//	gdto.setGid(1);
		gdto.setgName("Cricket");
		gdto.setgType("O");
		gdto.setDuration(8*60);	
		
		gdto.setPlayerList(pList);
		
		
		
		GameDao gdao = new GameDao();
		
		gdao.saveXX(gdto);
		
		
		System.out.println("main ended...");
		
		
	}

}
