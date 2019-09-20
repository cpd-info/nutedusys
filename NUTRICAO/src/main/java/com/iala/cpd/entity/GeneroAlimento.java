package com.iala.cpd.entity;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.Produto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneroAlimento extends Produto{
	@Id @GeneratedValue Long id;
	
	private Float densidade;
	private String validade;
	
	@Relationship("VALOR_NUTRICIONAL")
	private List<ValorNutricional> valorNutricional;
	
}