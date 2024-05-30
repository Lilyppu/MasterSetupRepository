package com.MasterSetup.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterSetup.Models.EntityMaster;
import com.MasterSetup.Repository.IEntityMasterRepository;

import java.util.List;

@Service
public class ServiceEntityMaster {
	@Autowired
	IEntityMasterRepository RepoEntiMst;
	
	public String getString() {
		return "test 232343434";
	}
	
	public List<EntityMaster> getEntityList() {
		return RepoEntiMst.findAll();
	}
}
