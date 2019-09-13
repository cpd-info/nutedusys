package com.iala.cpd.entityAbstract;

import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entity.Localidade;
import lombok.*;

@Data
public abstract class Endereco {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	private String cep;
	
	@EqualsAndHashCode.Exclude
	@Relationship("SITUA_SE")
	private Localidade localidade;
}