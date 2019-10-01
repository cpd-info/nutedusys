package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Permissao extends BaseEntity {
	
	private String permissao;
	
	@EqualsAndHashCode.Exclude
	@JsonIgnore
	@Relationship(type="CONCEDE_ACESSO", direction=Relationship.INCOMING)
    private List<Grupo> grupo = new ArrayList<Grupo>();
   
}
