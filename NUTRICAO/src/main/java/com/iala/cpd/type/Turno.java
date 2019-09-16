package com.iala.cpd.type;

public enum Turno {
	MANHA, TARDE, NOITE, INTEGRAL;
	
	private final String text;
	
	Turno(String text) {
        this.text = text;
    }
	
	Turno() {
		this.text="";
	}

	public String defString() {
        return (text == "") ? this.toString() : text;
    }
}
