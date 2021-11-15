package com.yourcompany.discoverytool.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Application_Dependency extends Identifiable{

	@Column
	private int applicationId;
	
	@Column
	private int dependencyId;
	
	@Column
	private int dependencyCount; 
}
