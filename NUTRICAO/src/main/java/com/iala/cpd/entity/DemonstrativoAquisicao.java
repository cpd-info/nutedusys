package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.Data;

@NodeEntity
@Data
public class DemonstrativoAquisicao {
	@Id @GeneratedValue Long id;
	
	private Integer anoLetivo;
	
	@Relationship("SOMA_DEMONSTRATIVO")
	public List<DemonstrativoPorEscola> demonstrativos = new ArrayList<>();
}