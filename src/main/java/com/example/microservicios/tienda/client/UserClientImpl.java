package com.example.microservicios.tienda.client;

import com.example.microservicios.tienda.model.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserClientImpl implements UserClient {

    @Override
    public UserDTO getUser(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        String footResourceUrl = "https://jsonplaceholder.typicode.com/post/1";
        UserDTO userDTO = restTemplate.getForObject(footResourceUrl,UserDTO.class);
        return userDTO;
    }



}
