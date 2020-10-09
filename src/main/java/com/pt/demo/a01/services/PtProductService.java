package com.pt.demo.a01.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.demo.a01.db.PtProduct;
import com.pt.demo.a01.db.PtProductRepository;

@Service
public class PtProductService {

	@Autowired
	private PtProductRepository productRepository;
	
	public List<PtProduct> getAllProducts() {
		List<PtProduct> result = new ArrayList<>();
		this.productRepository.findAll().forEach(result::add);
		return result;
	}
	
}
