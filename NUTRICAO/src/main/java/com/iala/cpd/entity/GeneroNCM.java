package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import lombok.Data;

@NodeEntity
@Data
public class GeneroNCM {
	@Id @GeneratedValue Long id;
	private Integer codigo;
	private String descricao;
	private String subGenero;
}