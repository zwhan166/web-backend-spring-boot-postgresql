package com.pt.demo.a01.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.demo.a01.db.PtBestellung;
import com.pt.demo.a01.db.PtBestellungRepository;

@Service
public class PtBestellungService {

	@Autowired
	private PtBestellungRepository bestellungRepository;
	
	public List<PtBestellung> getAllOrders() {
		List<PtBestellung> result = new ArrayList<PtBestellung>();
		this.bestellungRepository.findAll().forEach(result::add);
		return result;
	}
	
}
