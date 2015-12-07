package com.hospitalManagement.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hospitalManagement.model.HmsDoctMaster;

@Repository("doctorDAO")
public class DoctorDAOImpl extends AbstractDao<Integer, HmsDoctMaster> implements DoctorDAO {

	public HmsDoctMaster findById(int id) {
		HmsDoctMaster hmsDoctMaster = getByKey(id);
		return hmsDoctMaster;
		
	}

	public HmsDoctMaster findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(HmsDoctMaster hmsDoctMaster) {
		persist(hmsDoctMaster);
		
	}

	public void deleteBySSO(int docId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("DOC_CODE", docId));
		HmsDoctMaster hmsDoctMaster = (HmsDoctMaster)crit.uniqueResult();
		delete(hmsDoctMaster);
		
	}

	public List<HmsDoctMaster> findAllHmsDoctMaster() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("docName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		@SuppressWarnings("unchecked")
		List<HmsDoctMaster> hmsDoctMaster = (List<HmsDoctMaster>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
		return hmsDoctMaster;
	}

}
