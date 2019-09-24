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
public class TotalPorProduto {
	@Id @GeneratedValue Long id;
	
	private Float qtd;
	
	@Relationship(type="CONSTANDO", direction=Relationship.INCOMING)
	private DemonstrativoPorEscola demonstrativo;
	
	@Relationship("POR_SEGMENTO")
	private List<PorSegmento> porSegmento = new ArrayList<>();
	
	@Relationship("RECEBE_ITENS")
	private Produto produto;
	
}