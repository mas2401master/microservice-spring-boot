package com.usuario.service;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients: para decirle que desde aqui se va a llamar otros microservicios
@EnableFeignClients
@SpringBootApplication
//habilite este microservicio en el servidor de eureka
@EnableEurekaClient 
public class UsuarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioServiceApplication.class, args);
	}

}
