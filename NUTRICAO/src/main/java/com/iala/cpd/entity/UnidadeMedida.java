package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.iala.cpd.type.UnidadePadrao;

import lombok.Data;

@NodeEntity
@Data
public class UnidadeMedida {
	@Id @GeneratedValue Long id;
	private String nome;
	private UnidadePadrao unidadePadrao;
	private Long quantidade;
	
	public UnidadeMedida(GeneroAlimento genAlim) {
		this.setUnidadePadrao(genAlim.getUnidadePadrao());
	}
	public String getFormato(){
		return this.nome + "(" + this.quantidade + this.unidadePadrao.name() + ")";
	}
}