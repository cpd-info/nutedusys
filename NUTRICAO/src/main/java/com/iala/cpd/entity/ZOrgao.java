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
public class ZOrgao extends BaseEntity{
	private List<String> telefones = new ArrayList<>();
	private String email;
	
	@EqualsAndHashCode.Exclude
	@Relationship(type="SERVE_AO", direction=Relationship.INCOMING)
	private List<ZCargo> cargo = new ArrayList<>();
	
	public void setTelefone1(String tel) {
		this.telefones.set(0, tel);
	}
	
	public String getTelefone1() {
		return this.telefones.get(0);
	}
}
