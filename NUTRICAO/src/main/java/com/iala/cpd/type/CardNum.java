package com.iala.cpd.type;

public enum CardNum {
	CARDAPIO1("Cardápio 1"), CARDAPIO2("Cardápio 2");
	
	private final String text;
	
	CardNum(String text) {
        this.text = text;
    }
	
	CardNum() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
