package com.hospitalManagement.service;

import java.util.List;

import com.hospitalManagement.model.HmsDoctMaster;

public interface DoctorService {
	

	HmsDoctMaster findById(int id);
	
	void saveUser(HmsDoctMaster hmsDoctMaster);
	
	void updateUser(HmsDoctMaster hmsDoctMaster);
	
	void deleteUserById(int Id);

	List<HmsDoctMaster> findAllHmsDoctMaster(); 
	

}
