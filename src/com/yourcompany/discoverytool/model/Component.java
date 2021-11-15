package com.yourcompany.discoverytool.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Component extends Identifiable{
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "customerReference", referencedColumnName = "customerId")
	private Customer customer;
	
	@Column
	private String componentType;
	
	@Column
	private String componentName;
	
	@Column
	private String componentDescription;
	
	@Column
	private String isvName;
	
	@Column
	private String version;
	
	@Column
	private String clustered;
	
	@Column
	private String componentTechnology;
	
	@Column
	private String databaseInstanceName;
	
	@Column
	private String databaseName;
	
	@Column
	private String databaseSize;
	
	@Column
	private String supportStatus;
	
	@Column
	private LocalDate endOfExtendedSupportDate; 
	
	@Column
	private String componentOptionUsed;
	
	@Column
	@Stereotype("MEMO")
	private String comments;
	
//	@Column
//	String componentRef;
//	
//	@ManyToOne(fetch = FetchType.LAZY, optional = true)
//	@JoinColumn(name = "associatedApplicationReference", referencedColumnName = "applicationRef")
//	ApplicationDetails applicationDetails;
//
//    @ManyToOne(fetch=FetchType.LAZY, optional=true)
//    @JoinColumn(name = "associatedInfrastructureRefernce", referencedColumnName ="infrastructureRef")
//    Infrastructure infrastructure;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "app_comp_Id", referencedColumnName = "componentId")
	private Application_Component applicationComponent;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "comp_infra_Id", referencedColumnName = "componentId")
	private Component_Infrastructure componentInfrastructure;
	
}
