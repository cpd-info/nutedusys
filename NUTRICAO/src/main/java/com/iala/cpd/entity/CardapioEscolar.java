package com.iala.cpd.entity;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.iala.cpd.type.FaixaEtaria;

import lombok.Data;

@NodeEntity
@Data
public class CardapioEscolar {
	@Id @GeneratedValue Long id;
	
	@Relationship("USA_NO_CARDAPIO1")
	private List<CardapioSemanal> cardapio1;
	
	@Relationship("USA_NO_CARDAPIO2")
	private List<CardapioSemanal> cardapio2;
	
	private FaixaEtaria faixaEtaria;
	
}