package com.MasterSetup.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_OFF_MSTR")
public class OfficeMaster {
	@Id
	@Column(name="OF_CODE",length=20,  nullable = false)
	private String offCode;
	
	@Column(name="OF_DESC",length=50)
	private String offDesc;
	
	@Column(name="OF_TYPE",length=20)
	private String offType;
	
	@Column(name="OF_UPLEVEL_CODE",length=20)
	private String offUpLevelCode;
	
	@Column(name="OF_PIC",length=50)
	private String offPICe;
	
	@Column(name="OF_ADDR",length=200)
	private String offAddr;
	
	@Column(name="OF_CITY",length=50)
	private String offCity;
	
	@Column(name="OF_PROV",length=50)
	private String offProv;
	
	@Column(name="OF_NATION",length=50)
	private String offNation;
	
	@Column(name="OF_ZIP",length=10)
	private String offZip;
	
	@Column(name="OF_PHONE",length=30)
	private String offPhone;
	
	@Column(name="OF_FAX",length=30)
	private String offFax;
	
	@Column(name="OF_EMAIL",length=30)
	private String offEmail;
	
	@Column(name="OF_NPWP",length=30)
	private String offNpwp;
	
	@Column(name="AC_STATUS",length=2)
	private String offStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}

