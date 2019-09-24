package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;

@NodeEntity
@Data
public class Produto{
	@Id @GeneratedValue Long id;
	private String nome;
	private String descricao;
	private UnidadePadrao unidadePadrao;
	
	@Relationship("CODIGO_NCM")
	private GeneroNCM num_ncm;

}