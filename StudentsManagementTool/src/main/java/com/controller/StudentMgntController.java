package com.controller;

import com.service.StudentMgntService;

public class StudentMgntController {
	public static void main(String[] args) throws Exception {
		StudentMgntService sms=new StudentMgntService ();
		  //sms.insertData();
		 //sms.updateData();
		 sms.deleteData();
		  sms.selectData();
	}
}
