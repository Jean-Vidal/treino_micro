package com.microservico.msclientes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cpf;
	
	private String nome;
	
	private String idade;
	
	public Clientes(String cpf, String nome, String idade ) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
}