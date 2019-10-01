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
public class TabelaTaco extends BaseEntity {
	private Integer numAlimento;
	private String alimento;
	
	@EqualsAndHashCode.Exclude
	@Relationship("VALOR_NUTRICIONAL_100g")
	private List<Nutriente> valorNutricional100g = new ArrayList<Nutriente>();
}