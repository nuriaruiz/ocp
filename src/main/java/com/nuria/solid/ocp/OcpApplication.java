package com.nuria.solid.ocp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OcpApplication {

    @Autowired
    private GeneradorPrimosOrdenAsc genprimeAsc;

    @Autowired
    private GeneradorPrimosOrdenDesc genprimeDesc;

    public static void main(String[] args) {
        SpringApplication.run(OcpApplication.class, args);
    }

    @PostConstruct
    public void listen() {
        System.out.println("Asc prime number: "+genprimeAsc.primos(20));
        System.out.println("Desc prime number: "+genprimeDesc.primos(20));
    }
}
