package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import lombok.Data;

@RelationshipEntity("VALOR_NUTRICIONAL")
@Data
public class ValorNutricional {
	@Id @GeneratedValue Long id;
	private Float quantidade;
	
	@StartNode
	private GeneroAlimento alimento;
	
	@EndNode
	private Nutriente nutriente;
}