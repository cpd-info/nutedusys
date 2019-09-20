package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import lombok.Data;

@RelationshipEntity("CONTEMPLA")
@Data
public class QuantitativoSegmento {
	@Id @GeneratedValue Long id;
	private Long quantidade_alunos;
	
	@StartNode
	private Setor setor;
	
	@EndNode
	private Segmento segmento;
}