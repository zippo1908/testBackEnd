package com.groupc.pt.model;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Projects")
public class Projects{	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   private String name;
////	   
////	   @Column(name = "projectName")
////	   private String projectName;
////	   
////	   @OneToMany(mappedBy = "projects", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
////	   private Set<ProjectResources> projectResources = new HashSet<>();
//	   
//	   public Projects() {}
//	   
//	   public Projects(Long projectId, String projectName) {
//		   this.projectName = projectName;
//		   this.id = projectId;
//	   }

	   public Long getId() {
	      return id;
	   }

	   public void setId(Long id) {
	      this.id = id;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

}
