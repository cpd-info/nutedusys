package com.iala.cpd.type;

public enum FaixaEtaria {
	INFANTIL, ADULTO, TODOS;
	
	private final String text;
	
	FaixaEtaria(String text) {
        this.text = text;
    }
	
	FaixaEtaria() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
