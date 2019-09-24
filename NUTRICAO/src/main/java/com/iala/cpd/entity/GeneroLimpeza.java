package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneroLimpeza extends Produto{
	private String validade;
}