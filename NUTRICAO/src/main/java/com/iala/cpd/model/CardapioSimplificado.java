package com.iala.cpd.model;

import java.util.List;
import java.util.Map;
import com.iala.cpd.entity.CardapioSemanal;
import com.iala.cpd.type.DiaSemana;
import lombok.Data;

@Data
public class CardapioSimplificado {	
	private String nome_segmento;
	private List<Map<DiaSemana, String>> cardapios;
	
	public CardapioSimplificado(String nome_segmento, CardapioSemanal cardSem) {
		super();
		this.nome_segmento = nome_segmento;
	}
}