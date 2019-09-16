package com.iala.cpd.type;

public enum Vinculo {
	EFETIVO, CONTRATADO;
	
	private final String text;
	
	Vinculo(String text) {
        this.text = text;
    }
	
	Vinculo() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
