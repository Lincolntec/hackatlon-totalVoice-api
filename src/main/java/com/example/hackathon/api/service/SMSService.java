package com.example.hackathon.api.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import br.com.totalvoice.TotalVoiceClient;
import br.com.totalvoice.api.Sms;

@Service
public class SMSService {
	
	public void enviar() {
		
        
        try {
            TotalVoiceClient client = new TotalVoiceClient("e193b17287d1af50a71281b7d1ac4669");
            Sms sms = new Sms(client);

            JSONObject result = sms.enviar("19982353644", "Olá Parabéns Dorotea Lourdes de Souza você ganhou cinco mil reais no nosso sorteio da Medley ");
            System.out.println(result);

            System.out.println("Teste ligacao");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
