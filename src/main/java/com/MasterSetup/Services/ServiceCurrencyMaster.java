package com.MasterSetup.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterSetup.Models.CurrencyMaster;
import com.MasterSetup.Models.EntityMaster;
import com.MasterSetup.Repository.ICurrencyMasterRepository;
import com.MasterSetup.Repository.IEntityMasterRepository;

import java.util.List;

@Service
public class ServiceCurrencyMaster {
	@Autowired 
	ICurrencyMasterRepository repocurr;
	
	public List<CurrencyMaster> getCurrList(String status) {
		return repocurr.findByCurrStatus(status);		
	}
	
	
	
}
