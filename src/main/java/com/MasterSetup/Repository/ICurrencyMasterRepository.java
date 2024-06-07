package com.MasterSetup.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.MasterSetup.Models.CurrencyMaster;

@Repository
public interface ICurrencyMasterRepository extends JpaRepository<CurrencyMaster,String>{
	
	public List<CurrencyMaster> findByCurrStatus(String status);

}
