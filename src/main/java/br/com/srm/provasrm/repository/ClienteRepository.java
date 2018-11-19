package br.com.srm.provasrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.provasrm.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
