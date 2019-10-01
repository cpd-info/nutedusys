package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import io.leangen.graphql.annotations.GraphQLIgnore;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Usuario extends BaseEntity {
	
	private String login;
	
	@GraphQLIgnore
	private String senha;
	
	private Long matricula;
	
	private boolean ativo;
	
	@EqualsAndHashCode.Exclude
	@Relationship("PERTENCE_A")
	private List<Grupo> grupo = new ArrayList<Grupo>();

}
