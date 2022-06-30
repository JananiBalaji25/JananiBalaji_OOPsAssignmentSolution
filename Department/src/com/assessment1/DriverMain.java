package com.assessment1;

import com.assessment1.model.AdminDepartment;
import com.assessment1.model.HrDepartment;
import com.assessment1.model.TechDepartment;

public class DriverMain {
	public static void main(String args[]) {
		AdminDepartment admin = new AdminDepartment();
		HrDepartment	hr = new HrDepartment();
		TechDepartment 	tech = new TechDepartment();
		// Admin Department
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		//HR Department
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		//Tech Department
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
	}
	
	}


