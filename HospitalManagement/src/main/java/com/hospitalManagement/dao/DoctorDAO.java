package com.hospitalManagement.dao;

import java.util.List;

import com.hospitalManagement.model.HmsDoctMaster;

public interface DoctorDAO {
	HmsDoctMaster findById(int id);
	
	HmsDoctMaster findBySSO(String sso);
	
	void save(HmsDoctMaster hmsDoctMaster);
	
	void deleteBySSO(int docId);
	
	List<HmsDoctMaster> findAllHmsDoctMaster();

}
