package com.iala.cpd.type;

public enum Etnia {
	NAODECLARADA("Não declarada"), BRANCA("Branca"), PARDA("Parda"),
	INDIGENA("Indígena"), PRETA("Preta"), AMARELA("Amarela");

	private final String text;

	Etnia(String text) {
		this.text = text;
	}

	Etnia() {
		this.text = "";
	}

	public String defString() {
		return (text == "") ? this.toString() : text;
	}
}