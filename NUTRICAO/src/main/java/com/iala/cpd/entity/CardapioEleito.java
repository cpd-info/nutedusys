package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.type.CardNum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@RelationshipEntity("CARDAPIO_ELEITO")
@Data
@EqualsAndHashCode(callSuper=false)
public class CardapioEleito extends BaseEntity {
	private CardNum numCardapio;
	
	@StartNode
	private Setor Escola;
	
	@EndNode
	private CardapioEscolar cardapioEscolar;
	
}