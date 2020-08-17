package com.educando.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educando.course.entities.User;

@RestController // Responsavel por criar a api Rest
@RequestMapping (value = "/users") // Q indica a path do serviço, definimos o nome do recurso como users
public class UserResource {
	// Metodo para acessar os usuário esse é um EndPoint
	// Retorna respostas de requisição web. <User> é onde definimos o tipo de resposta neste caso é a class User
	// findAll - é o nome do metodo
	// Para indicar q esse metodo responde a uma requisição do tipo Get HTTP colocamos o @GetMapping
	@GetMapping
	public ResponseEntity<User> findAll(){
		// Instanciando o user
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		// Retorna resposta com sucesso da solicitação HTTP e .body(u) retorna o corpo q foi instanciado ou seja os dados nome, email, etc
		return ResponseEntity.ok().body(u);			
	}
}
