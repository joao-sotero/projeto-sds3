package com.sotero.stvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sotero.stvendas.DTO.SellerDTO;
import com.sotero.stvendas.entities.Seller;
import com.sotero.stvendas.repositories.sellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private sellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
