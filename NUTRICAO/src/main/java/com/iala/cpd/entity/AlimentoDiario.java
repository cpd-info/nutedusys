package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import lombok.Data;

@RelationshipEntity("COMPOSTO_POR")
@Data
public class AlimentoDiario {
	@Id @GeneratedValue Long id;
	private Float quantidade;
	private Float quantidade_disfagia;
	
	@StartNode
	private GeneroAlimento generoAlimento;
	
	@EndNode
	private MenuDiario menuDiario;
}