package com.sotero.stvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sotero.stvendas.DTO.SellerDTO;
import com.sotero.stvendas.service.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SaleController {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> fundAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
}
