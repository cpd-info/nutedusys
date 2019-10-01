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
public class DemonstrativoPorEscola extends BaseEntity {
	private Integer anoLetivo;
	private Integer num_cardapio;
	
	@Relationship(type="RECEBE_ITENS", direction=Relationship.INCOMING)
	private Setor Setor;
	
	@EqualsAndHashCode.Exclude
	@Relationship("CONSTANDO")
	private List<TotalPorProduto> relacaoProdutos = new ArrayList<TotalPorProduto>();
	
	public DemonstrativoPorEscola(Integer anoLetivo, Integer num_cardapio, Setor Setor) {
		this.anoLetivo=anoLetivo;
		this.num_cardapio=num_cardapio;
		this.Setor=Setor;
	}
	
}