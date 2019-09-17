package com.iala.cpd.entity;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import lombok.Data;

@NodeEntity
@Data
public class ZOrgao{
	@Id @GeneratedValue Long id;

	private String nome;
	private List<String> telefones;
	private String email;

	@Relationship(type="SERVE_AO", direction=Relationship.INCOMING)
	private List<ZCargo> cargo;
	
	public void setTelefone1(String tel) {
		this.telefones.set(0, tel);
	}
	
	public String getTelefone1() {
		return this.telefones.get(0);
	}
}
