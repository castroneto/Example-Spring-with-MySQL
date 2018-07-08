package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.UserRepository;
import com.model.database.UsuarioModel;

@SpringBootApplication
public class RestFullapiApplication {
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(RestFullapiApplication.class, args);
	}
	
	@RequestMapping("/")
	public void register() {
		UsuarioModel usuario = new UsuarioModel();
		usuario.setEmail("castroneto");
		usuario.setPassword("74123");
		userRepository.save(usuario);
	}
	@RequestMapping("/login")
	public String login() {
		return "ola";
	}
}
