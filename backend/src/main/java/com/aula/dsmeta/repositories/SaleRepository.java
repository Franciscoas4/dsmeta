package com.aula.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
