package com.microservico.mscartoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservico.mscartoes.domain.ClienteCartao;
import com.microservico.mscartoes.persistence.ClienteCartaoRepository;

@Service
public class ClienteCartaoService {
	
	@Autowired
	private ClienteCartaoRepository repository;
	
	public List<ClienteCartao> listCartoesByCpf(String cpf){
		return repository.findByCpf(cpf);
	}

}
