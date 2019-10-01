package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Pais extends BaseEntity {
	private int cod;
	private String nacionalidade;
	private String sigla;
	
	@EqualsAndHashCode.Exclude
	@Relationship(type="PERTENCE_A", direction=Relationship.INCOMING)
	private List<Estado> estados = new ArrayList<Estado>();
	
	@Relationship(type="CAPITAL", direction=Relationship.INCOMING)
	private Localidade capital;
}