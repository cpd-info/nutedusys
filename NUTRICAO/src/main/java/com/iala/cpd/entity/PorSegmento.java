package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import lombok.Data;

@RelationshipEntity("POR_SEGMENTO")
@Data
public class PorSegmento {
	@Id @GeneratedValue Long id;
	
	private Float qtdPorSegmento;
	
	@StartNode
	private TotalPorProduto totalPorProduto;
	
	@EndNode
	private Segmento segmento;
}