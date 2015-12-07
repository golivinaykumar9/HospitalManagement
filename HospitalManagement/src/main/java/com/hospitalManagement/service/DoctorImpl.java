package com.hospitalManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospitalManagement.dao.DoctorDAO;
import com.hospitalManagement.model.HmsDoctMaster;

@Service("doctorService")
@Transactional
public class DoctorImpl implements DoctorService {
	
	@Autowired
	private DoctorDAO doctorDAO;

	public HmsDoctMaster findById(int id) {
		return doctorDAO.findById(id);
		
	}

	
	public void saveUser(HmsDoctMaster hmsDoctMaster) {
		
		doctorDAO.save(hmsDoctMaster);
	}

	public void updateUser(HmsDoctMaster hmsDoctMaster) {
		HmsDoctMaster entity = doctorDAO.findById(hmsDoctMaster.getDOC_CODE());
		if(entity!=null){
			entity.setAuthBy(hmsDoctMaster.getAuthBy());
			entity.setCurrentDate(hmsDoctMaster.getCurrentDate());
			entity.setDeptCode(hmsDoctMaster.getDeptCode());
			entity.setDocAddr(hmsDoctMaster.getDocAddr());
			entity.setDocDesig(hmsDoctMaster.getDocDesig());
			entity.setDocIpFees(hmsDoctMaster.getDocIpFees());
			entity.setDocName(hmsDoctMaster.getDocName());
			entity.setDocOpFees(hmsDoctMaster.getDocOpFees());
			entity.setDocQual(hmsDoctMaster.getDocQual());
			entity.setDocSpec(hmsDoctMaster.getDocSpec());
			entity.setDocType(hmsDoctMaster.getDocType());
			entity.setPhoneOff(hmsDoctMaster.getPhoneOff());
			entity.setPhoneRes(hmsDoctMaster.getPhoneRes());
		}
		
	}

	public void deleteUserById(int Id) {
		doctorDAO.deleteBySSO(Id);
		
	}

	public List<HmsDoctMaster> findAllHmsDoctMaster() {
		return doctorDAO.findAllHmsDoctMaster();
	}

}
