package com.example.hackathon.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hackathon.api.model.Ligacao;
import com.example.hackathon.api.service.LigacoesService;

@RestController
@RequestMapping("/ligacoes")
public class Ligacoes {
	
	
	@Autowired
	private LigacoesService ligacoesService;
	
	@CrossOrigin
	@PostMapping
	public void efetuaLigacao(@RequestBody Ligacao ligacao) {
		
		ligacoesService.efetuarChamada(ligacao.getNumeroTelefonico(), ligacao.getMensagem());
	}
}
