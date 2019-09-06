package com.groupc.pt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PRFieldValues")
@Table(name = "PRFieldValuesInfo")
public class PRFieldValues{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private long Fieldid;
   private long ProjectResourceId;
   private long FieldValue;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public long getFieldId() {
      return Fieldid;
   }

   public void setFieldId(long name) {
      this.Fieldid = name;
   }

   public long getProjectResourceId() {
      return ProjectResourceId;
   }

   public void setProjectResourceId(long ProjectResourceId) {
      this.ProjectResourceId = ProjectResourceId;
   }
   
   public long getFieldValue() {
	      return FieldValue;
	   }

	   public void setFieldValue(long FieldValue) {
	      this.FieldValue = FieldValue;
	   }

}
