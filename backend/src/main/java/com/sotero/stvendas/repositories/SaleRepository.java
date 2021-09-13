package com.sotero.stvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sotero.stvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
