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
@Table(name = "COMPANY")
public class EntityMaster {
	
	@Id
	@Column(name="COMP_NO",length=10,  nullable = false)
	private String compNo;
	
	@Column(name="COMP_TYPE",length=2,  nullable = false)
	private String compType;
	
	@Column(name="COMP_LOGO",length=100)
	private String compLogo;
	
	@Column(name="COMP_CURRENCY",length=10)
	private String compCurr;
	
	@Column(name="COMP_NAME",length=100)
	private String compName;
	
	@Column(name="COMP_SHORT_NAME",length=20)
	private String compShortName;
	
	@Column(name="COMP_ADDRESS",length=200)
	private String compAddress;
	
	@Column(name="COMP_CITY",length=50)
	private String compCity;
	
	@Column(name="COMP_PROVINCE",length=50)
	private String compProvince;
	
	@Column(name="COMP_COUNTY",length=50)
	private String compCountry;
	
	@Column(name="COMP_ZIPCODE",length=8)
	private String compZipCode;
	
	@Column(name="COMP_TAXID",length=20)
	private String compTaxId;
	
	@Column(name="COMP_SB_NO",length=30)
	private String compSbNo;
	
	@Column(name="COMP_SB_DATE")
	private Date compSbDate;
	
	@Column(name="COMP_EMAIL", length=50)
	private String compEmail;
	
	@Column(name="COMP_PHONE", length=20)
	private String comopPhone;
	
	@Column(name="COMP_FAX", length=20)
	private String compFax;
	
	@Column(name="COMP_PHONE2", length=20)
	private String compPhone2;
	
	@Column(name="COMP_FAX2", length=20)
	private String compFax2;
	
	@Column(name="COMP_POBOX", length=10)
	private String compPoBox;
	
	@Column(name="COMP_URI", length=20)
	private String compURI;
	
	@Column(name="COMP_WEBSITE", length=100)
	private String compWebSite;
	
	@Column(name="COMP_HANDPHONE", length=20)
	private String compHandPhone;
	
	@Column(name="COMP_IP_PORT", length=20)
	private String compIpPort;
	
	@Column(name="COMP_ENABLE", length=1)
	private String compEnbale;
	
	
}
