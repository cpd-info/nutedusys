package com.iala.cpd.type;

public enum TipoRefeicao {
	DESEJUM, ALMOCO, LANCHE, JANTA;
	
	private final String text;
	
	TipoRefeicao(String text) {
        this.text = text;
    }
	
	TipoRefeicao() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}