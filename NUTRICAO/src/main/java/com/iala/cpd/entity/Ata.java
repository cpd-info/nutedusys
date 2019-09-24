package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.Data;

@NodeEntity
@Data
public class Ata {
	@Id @GeneratedValue Long id;
	private Integer numero;
	
	@Relationship("LICITADO_PARA")
	public List<Fornecedor> fornecedores = new ArrayList<>();
}