package com.microservico.msclientes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservico.msclientes.domain.Clientes;
import com.microservico.msclientes.service.ClientesService;

import jakarta.ws.rs.core.Response;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	ClientesService service;
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("TESTE AQUI");
		return "Hello";
	}
	
	@PostMapping
	public ResponseEntity<Clientes> salvarClientes(@RequestBody Clientes clientes) {
		var dados = service.save(clientes);
		
		return ResponseEntity.ok(dados);
	}
	
	@GetMapping
	public ResponseEntity<Clientes> buscaClientePorCpf(@RequestParam String cpf) {
		var dados = service.buscaPorCpf(cpf);
		
		return ResponseEntity.of(dados);
	}

}