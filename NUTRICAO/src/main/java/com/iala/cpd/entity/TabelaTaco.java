package com.iala.cpd.entity;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.Data;

@NodeEntity
@Data
public class TabelaTaco {
	@Id @GeneratedValue Long id;
	private Integer numAlimento;
	private String alimento;
	
	@Relationship("VALOR_NUTRICIONAL_100g")
	private List<Nutriente> valorNutricional100g;
}