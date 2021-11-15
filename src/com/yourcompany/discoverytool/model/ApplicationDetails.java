package com.yourcompany.discoverytool.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class ApplicationDetails extends Identifiable{

	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "customerReference", referencedColumnName = "customerId")
	private Customer customer;
	
	@Column
	private String applicationName;
	
	@Column
	@Stereotype("MEMO")
	private String description;
	
	@Column
	private String hostingLocation;
	
	@Column
	private String onPrimeLocation;
	
	@Column
	private String publicFacing;
	
	@Column
	private String iam;
	
	@Column
	private String accessMethod;
	
	@Column
	private String businessUnit;
	
	@Column
	private String businessOwner;
	
	@Column
	private String technicalOwner;
	
	@Column
	private String category;
	
	@Column
	private String impactedByProject;
	
	@Column
	private String succeededBy;
	
	@Column
	private String userLocation;
	
	@Column
	private String userNumber;
	
	@Column
	private String licenseInformation;
	
	@Column
	private String availabilityBySLA;
	
	@Column
	private String rto;
	
	@Column
	private String rpo;
	
	@Column
	private String isvName;
	
	@Column
	private String applicationVersion;
	
	@Column
	private String supportStatus;
	
	@Column
	private LocalDate endOfLifeDate;
	
	@Column
	private String customised;
	
	@Column
	private String managedServiceProvider;
	
	@Column
	private String primaryTechnology;
	
	@Column
	private String averageSupportCallsperMonth;
	
	@Column
	private String documentationAvailable;
	
	@Column
	@Stereotype("MEMO")
	private String comments;
	
//	@Column
//	String associatedCompRef;
//	
//	@Column
//	String associatedInfraRef;
//	
//	@Column
//	String associatedDependencyRef;
	
	@Column
	private String complexcity;
	
	@Column
	private String criticallity;
	
	@Column
	private String investmentTier;
	
	@Column
	private String migrationPattern;
	
	@Column
	private String applicationHealth;
	
	@Column
	private String cloudReadiness;
	
	@Column
	private String securityRating;
	
	@Column
	private String priority;
	
	@Column
	private String effort;
	
//	@Column
//	String applicationRef;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "app_comp_Id", referencedColumnName = "applicationId")
	//@JoinColumn(name = "associatedCompRef", referencedColumnName = "associatedApplicationRefernce")
	private Application_Component applicationComponent;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "app_infra_Id", referencedColumnName = "applicationId")
	private Application_Infrastructure applicationInfrastructure;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "app_dep_Id", referencedColumnName = "applicationId")
	private Application_Dependency applicationDependency;
	
}
