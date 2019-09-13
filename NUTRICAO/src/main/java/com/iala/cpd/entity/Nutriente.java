package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.iala.cpd.type.UnidadePadrao;

import lombok.Data;

@NodeEntity
@Data
public class Nutriente {
	@Id @GeneratedValue Long id;
	
	private String nutriente;
	private UnidadePadrao unidadePadrao;
	private Float valorDiario;
}