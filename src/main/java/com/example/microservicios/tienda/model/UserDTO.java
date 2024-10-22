package com.example.microservicios.tienda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDTO {

    private Integer id;
    @NonNull
    private String name;
    private String edad;
    private String lastname;



}
