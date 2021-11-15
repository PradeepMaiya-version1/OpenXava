package com.yourcompany.discoverytool.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Component_Infrastructure extends Identifiable{
	
	@Column
	private int componentId;
	
	@Column
	private int infrastructureId;
	
	@Column
	private String vmCount;
	
	@Column
	private String associatedComponentReference;
	
	@Column
	private String associatedInfrastructureReference;

}
