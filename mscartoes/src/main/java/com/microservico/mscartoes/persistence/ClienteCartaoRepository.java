package com.microservico.mscartoes.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservico.mscartoes.domain.ClienteCartao;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long>{
	
	List<ClienteCartao> findByCpf(String cpf);

}