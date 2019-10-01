package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Nutriente extends BaseEntity {
	private String nutriente;
	private UnidadePadrao unidadePadrao;
	private Double valorDiario;
}
