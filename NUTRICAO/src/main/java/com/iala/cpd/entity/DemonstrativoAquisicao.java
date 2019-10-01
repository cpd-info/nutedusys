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
public class DemonstrativoAquisicao extends BaseEntity {

	private Integer anoLetivo;
	
	@EqualsAndHashCode.Exclude
	@Relationship("SOMA_DEMONSTRATIVO")
	public List<DemonstrativoPorEscola> demonstrativos = new ArrayList<DemonstrativoPorEscola>();
}