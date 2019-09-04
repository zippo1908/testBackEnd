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

import com.groupc.pt.model.Kuser;

import com.groupc.pt.service.newService;

@RestController
public class KuserController{

   @Autowired
   private newService newService;

   /*---Add new user---*/
   @PostMapping("/user")
   public ResponseEntity<?> save(@RequestBody Kuser Kuser) {
      long id = newService.save(Kuser);
      return ResponseEntity.ok().body("New user has been saved with ID:" + id);
   }
   

   /*---Get a user by id---*/
   @GetMapping("/user/{id}")
   public ResponseEntity<Kuser> get(@PathVariable("id") long id) {
      Kuser Kuser = newService.getU(id);
      return ResponseEntity.ok().body(Kuser);
   }

   /*---get all users---*/
   @GetMapping("/user")
   public ResponseEntity<List<Kuser>> list() {
      List<Kuser> Kusers = newService.userlist();
      return ResponseEntity.ok().body(Kusers);
   }

   /*---Update a user by id---*/
   @PutMapping("/user/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Kuser Kuser) {
      newService.update(id, Kuser);
      return ResponseEntity.ok().body("user has been updated successfully.");
   }

   /*---Delete a user by id---*/
   @DeleteMapping("/user/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      newService.deleteU(id);
      return ResponseEntity.ok().body("user has been deleted successfully.");
   }
   
}