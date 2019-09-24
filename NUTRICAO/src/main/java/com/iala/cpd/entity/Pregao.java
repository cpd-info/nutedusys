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
public class Pregao {
	@Id @GeneratedValue Long id;
	
	private Integer numero;
	private Integer processo;
	private Integer licitacao;
	
	@Relationship("ORIGINA")
	public List<Ata> atas = new ArrayList<>();
	
	@Relationship("PROCESSOU")
	public DemonstrativoAquisicao aquisicao;
}