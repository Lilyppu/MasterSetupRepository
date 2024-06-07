package com.MasterSetup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MasterSetup.Models.OfficeMaster;
import com.MasterSetup.Services.ServiceOfficeMaster;

import java.util.List;

@RestController
public class ControllerOfficeMaster {
	@Autowired
	ServiceOfficeMaster servOffMst;
	
	@GetMapping("/setup/getofflist")
    public List<OfficeMaster> getOfficeList(String st){
       return servOffMst.getOfficeList(st);
    }
}
