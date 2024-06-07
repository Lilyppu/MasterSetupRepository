package com.MasterSetup.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MasterSetup.Models.CurrencyMaster;
import com.MasterSetup.Services.ServiceCurrencyMaster;

@RestController
public class ControllerCurrencyMaster {
	@Autowired
	ServiceCurrencyMaster servCurr;
	
	@GetMapping("/setup/getcurrlist")
	public List<CurrencyMaster> getCurrList(String st) {
		return servCurr.getCurrList(st);		
	}
	
	

}
