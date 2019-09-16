package com.iala.cpd.type;

public enum DiaSemana {
	SEG("Segunda"), TER("Terça"), QUA("Quarta"), 
	QUI("Quinta"), SEX("Sexta"), SAB("Sábado"), DOM("Domingo");
	
	private final String text;
	
	DiaSemana(String text) {
        this.text = text;
    }
	
	DiaSemana() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
