package com.yourcompany.discoverytool.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Infrastructure extends Identifiable {

	@OneToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "customerReference", referencedColumnName = "customerId")
	private Customer customer;

	@Column
	private String vmName;

	@Column
	@Stereotype("MEMO")
	private String description;

	@Column
	private String onPrimeLocation;

	@Column
	private String operatingSystem;

	@Column
	private String operatingSystemVersion;

	@Column
	private LocalDate endOfExtendedSupportDate;

	@Column
	private String environment;

	@Column
	private String machineType;

	@Column
	private String hypervisor;

	@Column
	private String cores;

	@Column
	private String ram;

	@Column
	private String nicCount;

	@Column
	private String tier1Stroage;

	@Column
	private String tier3Storage;

	@Column
	private String actualProcessorUtilization;

	@Column
	private String actualMemoryUtilization;

	@Column
	private String actualStorageUtilization;

	@Column
	private String ipAddress;

	@Column
	private String macAddress;

	@Column
	@Stereotype("MEMO")
	private String comments;
	
//	@Column
//	String infrastructureRef;

//	@ManyToOne(fetch = FetchType.LAZY, optional = true)
//	@JoinColumn(name = "associatedApplicationReference", referencedColumnName = "applicationRef")
//	ApplicationDetails applicationDetails;
//
//    @ManyToOne(fetch=FetchType.LAZY, optional=true)
//    @JoinColumn(name = "associatedComponentRefernce", referencedColumnName ="componentRef")
//    Component component;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "app_infra_Id", referencedColumnName = "infrastructureId")
	private Application_Infrastructure applicationInfrastructure;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "comp_infra_Id", referencedColumnName = "infrastructureId")
	private Component_Infrastructure componentInfrastructure;


}
