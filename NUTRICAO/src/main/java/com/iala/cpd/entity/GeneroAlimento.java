package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;

@NodeEntity
@Data
public class GeneroAlimento {
	@Id @GeneratedValue Long id;
	private String nome;
	private String descricao;
	private UnidadePadrao unidadePadrao;
	
	@Relationship("POSSUI_NUTRIENTES")
	private ValorNutricional valorNutricional;
	
}