package com.iala.cpd.type;

public enum TipoSetor {
	ESCOLA, CPD;
	
	private final String text;
	
	TipoSetor(String text) {
        this.text = text;
    }
	
	TipoSetor() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}