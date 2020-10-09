package com.pt.demo.a01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pt.demo.a01.db.PtBestellung;
import com.pt.demo.a01.db.PtCustomer;
import com.pt.demo.a01.db.PtProduct;
import com.pt.demo.a01.services.PtBestellungService;
import com.pt.demo.a01.services.PtCustomerService;
import com.pt.demo.a01.services.PtProductService;

@RestController
public class PtRestController {

	@Autowired
	private PtCustomerService customerService;
	
	@Autowired
	private PtProductService productService;
	
	@Autowired
	private PtBestellungService bestellungService;
	
	@RequestMapping(path = "/api/customers")
	public List<PtCustomer> getCustomers() {
		return this.customerService.getAllCustomers();
	}

	@RequestMapping(path = "/api/products")
	public List<PtProduct> getProducts() {
		return this.productService.getAllProducts();
	}

	@RequestMapping(path = "/api/orders")
	public List<PtBestellung> getOrders() {
		return this.bestellungService.getAllOrders();
	}

}
