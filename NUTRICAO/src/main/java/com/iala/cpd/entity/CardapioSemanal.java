package com.iala.cpd.entity;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.Data;

@NodeEntity
@Data
public class CardapioSemanal {
	@Id @GeneratedValue Long id;
	private String nome;
	private String descricao;
	
	@Relationship("SERVE")
	private Segmento segmento;
	
	@Relationship(type="MONTA", direction=Relationship.INCOMING)
	private List<Composicao> pratos;
}