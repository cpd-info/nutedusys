package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class ZCargo extends BaseEntity {
	private int cargaHoraria;
	private String classe;
	
	@Relationship("SERVE_AO")
	private ZOrgao orgao;

}
