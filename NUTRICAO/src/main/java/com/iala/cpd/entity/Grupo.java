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
public class Grupo extends BaseEntity {
	
	@EqualsAndHashCode.Exclude
	@JsonIgnore
	@Relationship(type="PERTENCE_A", direction=Relationship.INCOMING)
	private List<Usuario> usuario = new ArrayList<>();
	
	@EqualsAndHashCode.Exclude
	@Relationship("CONCEDE_ACESSO")
	private List<Permissao> permissao = new ArrayList<Permissao>();

}
