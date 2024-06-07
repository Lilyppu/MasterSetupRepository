package com.MasterSetup.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterSetup.Models.OfficeMaster;
import com.MasterSetup.Repository.IOfficeMasterRepository;

import java.util.List;

@Service
public class ServiceOfficeMaster {
	@Autowired
	IOfficeMasterRepository RepoOffMst;
	
	public List<OfficeMaster> getOfficeList(String offSts) {
		return RepoOffMst.findByOffStatus(offSts);
	}

}
