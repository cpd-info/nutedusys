package com.iala.cpd.entity;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.Data;

@NodeEntity
@Data
public class MenuDiario {
	@Id @GeneratedValue Long id;
	private String nome;
	private String descricao;
	
	@Relationship(type="COMPOE", direction=Relationship.INCOMING)
	private List<GeneroAlimento> generoAlimento;
	
	@Relationship("MONTA")
	private List<Composicao> cardapios;
}