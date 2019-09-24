package com.iala.cpd.entityAbstract;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import lombok.*;

@Data
public abstract class BaseEntity {
	@Id @GeneratedValue Long id;
	private Boolean ativo;
	private String nome;
}