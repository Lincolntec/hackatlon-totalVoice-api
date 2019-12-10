package com.example.hackathon.api.model;

import java.io.Serializable;

public class Ligacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroTelefonico;
	private String mensagem;
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroTelefonico == null) ? 0 : numeroTelefonico.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ligacao other = (Ligacao) obj;
		if (numeroTelefonico == null) {
			if (other.numeroTelefonico != null)
				return false;
		} else if (!numeroTelefonico.equals(other.numeroTelefonico))
			return false;
		return true;
	}
	
	
	
}
