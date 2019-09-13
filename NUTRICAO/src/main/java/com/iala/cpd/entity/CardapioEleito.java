package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import com.iala.cpd.type.CardNum;
import lombok.Data;

@RelationshipEntity("CARDAPIO_ELEITO")
@Data
public class CardapioEleito {
	@Id @GeneratedValue Long id;
	private CardNum numCardapio;
	
	@StartNode
	private Setor Escola;
	
	@EndNode
	private CardapioEscolar cardapioEscolar;
	
}