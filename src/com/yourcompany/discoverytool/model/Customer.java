package com.yourcompany.discoverytool.model;

import java.io.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@SuppressWarnings("serial")
@Entity @Getter @Setter
public class Customer extends Identifiable implements Serializable{
	
	@Hidden
	@Column
	private String versionId = UUID.randomUUID().toString();
	
	@Column(length = 10)
	private int customerId;
	
	/*
	 * @OneToOne(mappedBy = "customer") Set<Dependency> dependency = new
	 * HashSet<Dependency>();
	 */

}
