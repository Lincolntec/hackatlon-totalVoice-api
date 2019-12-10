package com.example.hackathon.api.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import br.com.totalvoice.TotalVoiceClient;
import br.com.totalvoice.api.Tts;

@Service
public class LigacoesService {

	
public void efetuarChamada(String numeroTelefonico, String mensagem) {
		
	System.out.println("numero: " + numeroTelefonico);
	System.out.println("mensagem fdsfsdfsdfsdfdsf: " + mensagem);
        
        try {
            TotalVoiceClient client = new TotalVoiceClient("e193b17287d1af50a71281b7d1ac4669");
            Tts tts = new Tts(client);

            JSONObject result = tts.enviar(numeroTelefonico, mensagem);
            System.out.println(result);

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
