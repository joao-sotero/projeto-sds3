package com.sotero.stvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sotero.stvendas.DTO.SellerDTO;
import com.sotero.stvendas.entities.Seller;
import com.sotero.stvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public Page<SellerDTO> findAll(Pageable pageable){
			Page<Seller> result = repository.findAll(pageable);
			return result.map(x -> new SellerDTO(x));
	}
}
