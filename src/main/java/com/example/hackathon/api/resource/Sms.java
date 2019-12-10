package com.example.hackathon.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hackathon.api.service.SMSService;

@RestController
@RequestMapping("/sms")
public class Sms {
	

	@Autowired
	private SMSService enviaSMS;
	
	@GetMapping
	public void efetuaLigacao() {
		
		enviaSMS.enviar();
	}

}
