package com.yourcompany.discoverytool.model;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Dependency extends Identifiable{
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "customerReference", referencedColumnName = "customerId")
	private Customer customer;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional = true)
//	@JoinColumn(name = "associatedApplicationReference", referencedColumnName = "applicationRef")
//	ApplicationDetails applicationDetails;
	
	@Column
	private String dependencyType;
	
	@Column
	private String dependencyOn;
	
	@Column
	private String direction;
	
	@Column
	private String frequency;
	
	@Column
	private String volumn;
	
	@Column
	private String via;
	
	@Column
	private String dependencyTechnology;
	
	@Column
	@Stereotype("MEMO")
	private String comments;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name = "app_dep_Id", referencedColumnName = "dependencyId")
	private Application_Dependency applicationDependency;
	
	
}
