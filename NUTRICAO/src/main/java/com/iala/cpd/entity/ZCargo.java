package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.*;

@NodeEntity
@Data
public class ZCargo {
	@Id @GeneratedValue Long id;
	
	private String nome;
	private int cargaHoraria;
	private String classe;
	
	@EqualsAndHashCode.Exclude
	@Relationship("SERVE_AO")
	private ZOrgao orgao;

}
