package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class TotalPorProduto extends BaseEntity {
	
	private Double qtd;
	
	@Relationship(type="CONSTANDO", direction=Relationship.INCOMING)
	private DemonstrativoPorEscola demonstrativo;
	
	@EqualsAndHashCode.Exclude
	@Relationship("POR_SEGMENTO")
	private List<PorSegmento> porSegmento = new ArrayList<PorSegmento>();
	
	@Relationship("RECEBE_ITENS")
	private Produto produto;
	
}