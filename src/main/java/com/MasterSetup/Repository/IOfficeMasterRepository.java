package com.MasterSetup.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.MasterSetup.Models.OfficeMaster;

@Repository
public interface IOfficeMasterRepository extends JpaRepository<OfficeMaster, String> {
	
	public List<OfficeMaster> findByOffStatus(String offSts);

}
