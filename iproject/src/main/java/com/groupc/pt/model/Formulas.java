package com.groupc.pt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Formula")
@Table(name = "FormulaList")
public class Formulas{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String Formula;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   
   public void setFormula(String Formula) {
	   this.Formula = Formula;
   }
   
   public String getFormula() {
	   return Formula;
   }


}
