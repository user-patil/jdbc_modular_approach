package com.service;

import com.dao.StudentMgntDao;

public class StudentMgntService {
	public void insertData() throws Exception {
		StudentMgntDao d = new StudentMgntDao();
		d.insertData();
	}

	public void updateData() throws Exception {
		StudentMgntDao d = new StudentMgntDao();
		d.updateData();
	}

	public void deleteData() throws Exception {
		StudentMgntDao d = new StudentMgntDao();
		d.deleteData();
	}

	public void selectData() throws Exception {
		StudentMgntDao d = new StudentMgntDao();
		d.selectData();
	}

}
