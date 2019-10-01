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
public class Ata extends BaseEntity {
	private Integer numero;
	
	@EqualsAndHashCode.Exclude
	@Relationship("LICITADO_PARA")
	public List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
}