package com.iala.cpd.entity;

import java.util.Date;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateString;

import lombok.Data;

@NodeEntity
@Data
public class Contrato {
	@Id @GeneratedValue Long id;
	private Integer numero;
	private Float total;
	
	@DateString("dd/MM/YYYY")
	private Date dataInicial;
	
	@DateString("dd/MM/YYYY")
	private Date dataFinal;
	
	@Relationship("LICITADO_PARA")
	public Fornecedor fornecedor;
	
}