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
@Table(name = "CURRENCY_MASTER")
public class CurrencyMaster {
	
	@Id
	@Column(name="CURR_CODE",length=5,  nullable = false)
	private String currCode;
	
	@Column(name="CURR_DESC",length=50)
	private String currDesc;
	
	@Column(name="CURR_STATUS",length=50)
	private String currStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}
