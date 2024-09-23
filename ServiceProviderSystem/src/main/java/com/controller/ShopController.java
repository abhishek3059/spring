package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Connection;
import com.service.ProviderService;
@RestController
public class ShopController {	
	@Autowired
	private ProviderService providerService;
	
	@PostMapping("/SPS/addConnection")
	public boolean addConnection(@RequestBody Connection connectionObj) {		
		return providerService.addConnection(connectionObj);
	}
	@GetMapping("SPS/findConnectionById/{connectionNum}")
	public Connection findConnectionById(@PathVariable Integer connectionNum) {
			return providerService.findConnectionById(connectionNum);	
	}
	@GetMapping("/SPS/findAllConnection")
	public List<Connection> findAllConnection() {
		return providerService.viewAllConnections();
	}

	public ProviderService getProviderService() {
		return providerService;
	}

	public void setProviderService(ProviderService providerService) {
		this.providerService = providerService;
	}	
	
}
