package com.microservico.msclientes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservico.msclientes.domain.Clientes;
import com.microservico.msclientes.persistence.ClientesRepository;

@Service
public class ClientesService {
	
	@Autowired
	ClientesRepository repository;
	
	public Clientes save(Clientes clientes) {
		if(clientes == null) {
			return null;
		}
		
		return repository.save(clientes);
	}
	
	public Optional<Clientes> buscaPorCpf(String cpf){
		if(cpf == null) {
			return null;
		}
		
		return repository.findByCpf(cpf);
	}

}
