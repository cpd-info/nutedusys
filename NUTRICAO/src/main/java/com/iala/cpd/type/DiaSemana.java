package com.iala.cpd.type;

import com.iala.cpd.utils.TextUtils;

public enum DiaSemana {
	SEG("Segunda", "Segunda-Feira"), TER("Terça", "Terça-Feira"),
	QUA("Quarta", "Quarta-Feira"), QUI("Quinta", "Quinta-Feira"), 
	SEX("Sexta", "Sexta-Feira"), SAB("Sábado", "Sábado"), 
	DOM("Domingo", "Domingo");
	
	private final String text;
	private final String text_full;
	
	DiaSemana(String text, String text_full) {
        this.text = text;
        this.text_full = text_full;
    }
	
	DiaSemana() {
		this.text="";
		this.text_full = "";
	}

	public String FormatoSimples() {
		return (text == "") ? this.toString() : text;
    }
	
	public String FormatoCompleto() {
		return (text_full == "") ? this.toString() : text_full;
    }
	
	@Override
	public String toString() {
		return TextUtils.firstLetterUp( this.toString());
	}
}
