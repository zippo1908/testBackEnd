package com.groupc.pt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "userField")
@Table(name = "userField")
public class userField{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String Scope;
   private String typeOfField;

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

   public String getScope(){
      return Scope;
   }

   public void setScope(String Scope){
      this.Scope = Scope;
   }

   public String getTypeField() {
      return typeOfField;
   }

   public void setTypeOfField(String typeOfField) {
      this.typeOfField = typeOfField;
   }
}
