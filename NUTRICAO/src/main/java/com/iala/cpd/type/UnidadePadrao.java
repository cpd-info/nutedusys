package com.iala.cpd.type;

public enum UnidadePadrao {
	UN("Unidade"), KG("Kilograma"), L("Litro"), CAL("Caloria");
	
	private final String text;
	
	UnidadePadrao(String text) {
        this.text = text;
    }
	
	UnidadePadrao() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
