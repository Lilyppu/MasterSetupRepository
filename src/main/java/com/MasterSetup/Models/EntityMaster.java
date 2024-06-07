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
@Table(name = "ENTITY_MASTER")
public class EntityMaster {
	
	@Id
	@Column(name="ENTY_TYPE",length=2,  nullable = false)
	private String entyType;
	
	@Column(name="ENTY_ADDRESS",length=200)
	private String entyAddress;
	
	@Column(name="ENTY_CITY",length=50)
	private String entyCity;
	
	@Column(name="ENTY_COUNTY",length=50)
	private String entyCountry;
	
	@Column(name="ENTY_CURRENCY",length=5)
	private String entyCurr;
	
	@Column(name="ENTY_EMAIL", length=50)
	private String entyEmail;
	
	@Column(name="ENTY_ENABLE", length=1)
	private String entyEnable;
	
	@Column(name="ENTY_FAX", length=20)
	private String entyFax;
	
	@Column(name="ENTY_FAX2", length=20)
	private String entyFax2;
	
	@Column(name="ENTY_HANDPHONE", length=20)
	private String entyHandPhone;
	
	@Column(name="ENTY_IP_PORT", length=20)
	private String entyIpPort;
	
	@Column(name="ENTY_NAME",length=100)
	private String entyName;
	
	@Column(name="ENTY_NO",length=10)
	private String entyNo;
	
	@Column(name="ENTY_PHONE", length=20)
	private String entyPhone;
	
	@Column(name="ENTY_PHONE2", length=20)
	private String entyPhone2;
	
	@Column(name="ENTY_POBOX", length=10)
	private String entyPoBox;
	
	@Column(name="ENTY_PROVINCE",length=50)
	private String entyProvince;
	
	@Column(name="ENTY_SB_DATE")
	private Date entySbDate;
	
	@Column(name="ENTY_SB_NO",length=30)
	private String entySbNo;
	
	@Column(name="ENTY_SHORT_NAME",length=20)
	private String entyShortName;
	
	@Column(name="ENTY_TAXID",length=20)
	private String entyTaxId;
		
	@Column(name="ENTY_URI", length=20)
	private String entyURI;
	
	@Column(name="ENTY_WEBSITE", length=100)
	private String entyWebSite;
	
	@Column(name="ENTY_ZIPCODE",length=8)
	private String entyZipCode;
	
	@Column(name="AC_USER_CRE",length=20)
	private String entyUserCre;
	
	@Column(name="AC_DATE_CRE")
	private Date entyDateCre;
	
	@Column(name="AC_USER_UPD",length=20)
	private String entyUserUpd;
	
	@Column(name="AC_DATE_UPD")
	private Date entyDateUpd;
		
}
