package com.iala.cpd.type;

public enum Sexo {
	M("Maculino"), F("Feminino");
	
	private final String text;
	
	Sexo(String text) {
        this.text = text;
    }
	
	Sexo() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
