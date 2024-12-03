package com.microservico.mscartoes.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservico.mscartoes.domain.Cartao;
import com.microservico.mscartoes.persistence.CartaoRepository;

import jakarta.transaction.Transactional;

@Service
public class CartaoService {
	
	@Autowired
	CartaoRepository repository;
	
	@Transactional
	public Cartao save(Cartao cartao) {
		
		if(cartao == null) {
			return null;
		}
		
		return repository.save(cartao);
	}
	
	public List<Cartao> getCartoesRendaMenorIgual(Long renda){
		var rendaBigDecimal = BigDecimal.valueOf(renda);
		
		return repository.findByRendaLessThanEqual(rendaBigDecimal);
	}
	

}
