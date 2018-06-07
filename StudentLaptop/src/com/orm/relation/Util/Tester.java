package com.orm.relation.Util;

import java.util.ArrayList;
import java.util.List;


import com.orm.relation.DAO.LaptopDao;
import com.orm.relation.DTO.Laptop;
import com.orm.relation.DTO.Student;

public class Tester {
	
	public static void main(String[] args) {
		
		System.out.println("main started..");
		
		Laptop lap1 = new Laptop();
		lap1.setlName("Apple");
		
		Laptop lap2 = new Laptop();
		lap2.setlName("Samsung");
		
		
		List<Laptop> lapList = new ArrayList<>();
		lapList.add(lap1);
		lapList.add(lap2);
		
		
		Student stu = new Student();
		stu.setName("Arya Stark");
		stu.setMarks(85);
		
		lap1.setStu(stu);
		lap2.setStu(stu);
		
		LaptopDao lDao = new LaptopDao();
		lDao.saveLaptop(lap1);
		lDao.saveLaptop(lap2);
			
		
		System.out.println("main ended..");
	}

}
