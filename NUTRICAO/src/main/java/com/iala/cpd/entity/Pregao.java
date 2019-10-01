package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Pregao extends BaseEntity {
	private Integer numero;
	private Integer processo;
	private Integer licitacao;
	
	@EqualsAndHashCode.Exclude
	@Relationship("ORIGINA")
	public List<Ata> atas = new ArrayList<Ata>();
	
	@Relationship("PROCESSOU")
	public DemonstrativoAquisicao aquisicao;
}