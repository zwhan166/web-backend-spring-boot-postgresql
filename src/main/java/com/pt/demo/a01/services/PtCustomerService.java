package com.pt.demo.a01.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.demo.a01.db.PtCustomer;
import com.pt.demo.a01.db.PtCustomerRepository;

@Service
public class PtCustomerService {
	
	@Autowired
	private PtCustomerRepository customerRepository;

	public List<PtCustomer> getAllCustomers() {
		List<PtCustomer> result = new ArrayList<PtCustomer>();
		this.customerRepository.findAll().forEach(result::add);
		return result;
	}
}
