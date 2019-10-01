package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneroNCM extends BaseEntity {
	private Integer codigo;
	private String subGenero;
}