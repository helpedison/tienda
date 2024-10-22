package com.example.microservicios.tienda.controllers;

import com.example.microservicios.tienda.model.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersControllerRest {

   public ResponseEntity<?> getUserById(@PathVariable Integer id) {

       System.out.println(" Recovery user by Id");
       UserDTO userDTO = new UserDTO();
       userDTO.setId(1);
       userDTO.setName("Benedettelli");
       userDTO.setLastname("Benetelli");
       userDTO.setEdad("23");
       return ResponseEntity.ok(userDTO);
    }

}
