package com.example.microservicios.tienda.configurations;

import org.springframework.beans.factory.annotation.Value;

public class ConfigurationApp {

    private String name ;
    private String year ;
    private String edition;
    private String[] countries;
    @Value("${JAVA_HOME}")
    private String javaHome;



}
