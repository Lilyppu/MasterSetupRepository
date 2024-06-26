package com.MasterSetup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.MasterSetup.Models.EntityMaster;

@Repository
public interface IEntityMasterRepository extends JpaRepository<EntityMaster, String>{

}