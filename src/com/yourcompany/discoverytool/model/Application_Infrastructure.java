package com.yourcompany.discoverytool.model;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Application_Infrastructure extends Identifiable{
	
	@Column
	private int applicationId;
	
	@Column
	private int infrastructureId;
	
	@Column
	private String vmCount;
	
	@Column
	private String associatedApplicationReference;

}
