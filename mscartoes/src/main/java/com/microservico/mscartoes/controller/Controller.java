package com.microservico.mscartoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservico.mscartoes.DTO.CartaoSaveRequest;
import com.microservico.mscartoes.DTO.CartoesPorClienteResponse;
import com.microservico.mscartoes.domain.Cartao;
import com.microservico.mscartoes.service.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class Controller {
	
	@Autowired
	private CartaoService service;
	
	@GetMapping("/status")
	public String status() {
		System.out.println("Log de instância!");
		return "ok";
	}
	
	@PostMapping
	public ResponseEntity cadastra(@RequestBody CartaoSaveRequest request) {
		Cartao cartao = request.toModel();
		service.save(cartao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping(params = "renda")
	public ResponseEntity<List<Cartao>> getCartoesRendaAte(@RequestParam("renda") Long renda){
		List<Cartao> list = service.getCartoesRendaMenorIgual(renda);
		return ResponseEntity.ok(list);
	}
	
	public ResponseEntity<List<CartoesPorClienteResponse>> getCartoesByCliente(String cpf){
		
	}

}