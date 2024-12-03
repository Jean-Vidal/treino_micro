package com.microservico.mscartoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservico.mscartoes.DTO.CartaoSaveRequest;
import com.microservico.mscartoes.domain.Cartao;
import com.microservico.mscartoes.service.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class Controller {
	
	@Autowired
	private CartaoService service;
	
	@GetMapping
	public String status() {
		System.out.println("Log de instância!");
		return "ok";
	}
	
	public ResponseEntity cadastra(@RequestBody CartaoSaveRequest request) {
		Cartao cartao = request.toModel();
		service.save(cartao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
