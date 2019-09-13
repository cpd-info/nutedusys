package com.iala.cpd.service;

import java.util.List;
import java.util.Map;
import com.iala.cpd.entity.CardapioSemanal;
import com.iala.cpd.entity.Segmento;
import com.iala.cpd.type.DiaSemana;
import lombok.Data;

@Data
public class CardapioService {	
	private String nome_segmento;
	private List<Map<DiaSemana, String>> cardapios;
	
	public CardapioService(Segmento segmento, List<CardapioSemanal> cardMen) {
		super();
		this.nome_segmento = segmento.getNome();
	}
}