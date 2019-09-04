package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.iala.cpd.type.DiaSemana;

import lombok.Data;

@NodeEntity
@Data
public class Cardapio {
	@Id @GeneratedValue Long id;
	private DiaSemana semana;
}