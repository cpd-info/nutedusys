package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.type.FaixaEtaria;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Segmento extends BaseEntity {
	private String nivel;
	private FaixaEtaria faixaEtaria;
	
	@EqualsAndHashCode.Exclude
	@Relationship(type="CONTEMPLA", direction=Relationship.INCOMING)
	private List<QuantitativoSegmento> escolasPorSegmento = new ArrayList<QuantitativoSegmento>();
}