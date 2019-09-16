package com.iala.cpd.type;

public enum NomeTs {
	A("Tipo A"), B("Tipo B"), O("Tipo O"), AB("Tipo AB");
	
	private final String text;
	
	NomeTs(String text) {
        this.text = text;
    }
	
	NomeTs() {
		this.text="";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
    }
}
