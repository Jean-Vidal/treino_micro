package com.microservico.mscartoes.DTO;

import java.math.BigDecimal;

import com.microservico.mscartoes.domain.Cartao;
import com.microservico.mscartoes.enums.BandeiraCartao;

import lombok.Data;

@Data
public class CartaoSaveRequest {
	private String nome;
	private BandeiraCartao bandeira;
	private BigDecimal renda;
	private BigDecimal limite;
	
	public Cartao toModel() {
		return new Cartao(nome, bandeira, renda, limite);
	}
}