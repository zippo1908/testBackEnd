package com.groupc.pt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.groupc.pt.model.Fields;
import com.groupc.pt.service.FieldsService;


@RestController
public class FieldsController {
		@Autowired
		private FieldsService FieldService;
	   /*---Add new user---*/
	   @PostMapping("/Field")
	   public ResponseEntity<?> save(@RequestBody Fields Kuser) {
	      long id = FieldService.save(Kuser);
	      return ResponseEntity.ok().body("New Field has been saved with ID:" + id);
	   }
	   

	   /*---Get a user by id---*/
	   @GetMapping("/Field/{id}")
	   public ResponseEntity<Fields> get(@PathVariable("id") long id) {
	      Fields Kuser = FieldService.getU(id);
	      return ResponseEntity.ok().body(Kuser);
	   }

	   /*---get all users---*/
	   @GetMapping("/Field")
	   public ResponseEntity<List<Fields>> list() {
	      List<Fields> Kusers = FieldService.userlist();
	      return ResponseEntity.ok().body(Kusers);
	   }

	   /*---Update a user by id---*/
	   @PutMapping("/Field/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Fields Kuser) {
		   FieldService.update(id, Kuser);
	      return ResponseEntity.ok().body("Field"+id+" has been updated successfully.");
	   }

	   /*---Delete a user by id---*/
	   @DeleteMapping("/Field/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
		   FieldService.deleteU(id);
	      return ResponseEntity.ok().body("Field"+id+" has been deleted successfully.");
	      
	   }
	   
	   
}
