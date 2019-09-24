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
public class DemonstrativoPorEscola {
	@Id @GeneratedValue Long id;
	
	private Integer anoLetivo;
	private Integer num_cardapio;
	
	@Relationship(type="RECEBE_ITENS", direction=Relationship.INCOMING)
	private Setor Setor;
	
	@Relationship("CONSTANDO")
	private List<TotalPorProduto> relacaoProdutos = new ArrayList<>();
	
}