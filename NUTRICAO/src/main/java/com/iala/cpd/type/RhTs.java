package com.iala.cpd.type;

public enum RhTs {
	POSITIVO("+"), NEGATIVO("-");
	
	private final String text;
	
	RhTs(String text) {
        this.text = text;
    }
	
	RhTs() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
