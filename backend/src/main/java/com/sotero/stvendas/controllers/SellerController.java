package com.sotero.stvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sotero.stvendas.DTO.SellerDTO;
import com.sotero.stvendas.service.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	@Autowired
	private SellerService service;	
	
	@GetMapping
	public ResponseEntity<Page<SellerDTO>> fundAll(Pageable pageable){
		Page<SellerDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
}
