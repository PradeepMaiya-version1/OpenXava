package com.yourcompany.discoverytool.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Application_Component extends Identifiable{
	
	@Column
	private int applicationId;
	
	@Column
	private int componentId;
	
	@Column
	private String associatedComponentCount;
	
	@Column
	private String associatedComponentType;
	
	@Column
	private String associatedDatabaseCount;
	
	@Column
	private String associatedApplicationRefernce;

}
