package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class UnidadeMedida extends BaseEntity {
	private String nomeAbreviado;
	private UnidadePadrao unidadePadrao;
	private Double quantidade;
	
	public UnidadeMedida(Produto prod) {
		this.setUnidadePadrao(prod.getUnidadePadrao());
	}
	public String getFormato(){
		return this.getNome() + "(" + this.quantidade + this.unidadePadrao.name() + ")";
	}
}