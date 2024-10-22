package com.example.microservicios.tienda.controllers;


import com.example.microservicios.tienda.configurations.ConfigurationApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoControllerRest {

    private Logger log = LoggerFactory.getLogger(HolaMundoControllerRest.class);

    @Autowired
    private ConfigurationApp  appConfig;

    @GetMapping("/holaMundo")
    public String saludo () {


        log.info(" Ejecutar hola mundo info ");
        log.debug("error al ejecutar esta linea");
        log.info("error al ejecutar esta linea");
        log.warn("error al ejecutar esta linea");
        log.error("error al ejecutar esta linea");


        return "Hola Mundo servicio Rest Java" +appConfig;

    }




}
