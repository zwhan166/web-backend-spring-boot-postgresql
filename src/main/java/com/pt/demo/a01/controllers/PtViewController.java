package com.pt.demo.a01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pt.demo.a01.services.PtBestellungService;
import com.pt.demo.a01.services.PtCustomerService;
import com.pt.demo.a01.services.PtProductService;

@Controller
public class PtViewController {

	@Autowired
	private PtCustomerService customerService;

	@Autowired
	private PtProductService productService;

	@Autowired
	private PtBestellungService bestellungService;
	
	@GetMapping("/")
	public String home() {
		return "index.xhtml";
	}
	
	@GetMapping("/customers")
	public String customers(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());
		return "c.xhtml";
	}
	
	@GetMapping("/products")
	public String products(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "p.xhtml";
	}
	
	@GetMapping("/orders")
	public String orders(Model model) {
		model.addAttribute("orders", bestellungService.getAllOrders());
		return "o.xhtml";
	}
	
}
