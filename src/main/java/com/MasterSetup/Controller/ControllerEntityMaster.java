package com.MasterSetup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MasterSetup.Models.EntityMaster;
import com.MasterSetup.Services.ServiceEntityMaster;

import java.util.List;

@RestController
public class ControllerEntityMaster {
	@Autowired
	ServiceEntityMaster servEntMst;
	
	@GetMapping("/Master/test123")
    public String getStrng(){
       return servEntMst.getString();
    }
	
	@GetMapping("/Master/entitylist")
    public List<EntityMaster> getEntityList(){
       return servEntMst.getEntityList();
    }

}

