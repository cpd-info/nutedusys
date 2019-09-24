package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneroAlimento extends Produto{
	
	private Float densidade;
	private String validade;
    
	@Relationship("VALOR_NUTRICIONAL")
	private List<ValorNutricional> valorNutricional = new ArrayList<>();

}