package com.iala.cpd.entity;

import java.util.Arrays;
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
	
	@Relationship("REFERENTE_A")
	private Integer anoLetivo;
	
        //Limitação de lista precisa de testes
	@Relationship("USA_NO_CARDAPIO1")
	private List<CardapioSemanal> cardapio1 = Arrays.asList(new CardapioSemanal[4]);
	
        //Limitação de lista precisa de testes
	@Relationship("USA_NO_CARDAPIO2")
	private List<CardapioSemanal> cardapio2 = Arrays.asList(new CardapioSemanal[4]);
	
	@Relationship(type="CARDAPIO_ELEITO", direction=Relationship.INCOMING)
	private List<CardapioEleito> escolas;
	
	private FaixaEtaria faixaEtaria;
	
}
