package com.example.microservicios.tienda.client;

import com.example.microservicios.tienda.model.UserDTO;

public interface UserClient {

   public UserDTO getUser(Integer id);

}
