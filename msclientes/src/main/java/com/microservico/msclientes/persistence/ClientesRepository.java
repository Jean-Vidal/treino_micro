package com.microservico.msclientes.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservico.msclientes.domain.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

	Optional<Clientes> findByCpf(String cpf);
}