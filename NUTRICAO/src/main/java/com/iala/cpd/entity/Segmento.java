package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.iala.cpd.type.FaixaEtaria;
import lombok.*;

@NodeEntity
@Data
public class Segmento {
	@Id @GeneratedValue Long id;
	private String nome;
	private String nivel;
	private FaixaEtaria faixaEtaria;
	
	@Relationship(type="CONTEMPLA", direction=Relationship.INCOMING)
	private List<QuantitativoSegmento> escolasPorSegmento = new ArrayList<>();
}