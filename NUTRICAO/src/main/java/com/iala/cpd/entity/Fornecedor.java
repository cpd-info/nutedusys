package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import lombok.Data;

@NodeEntity
@Data
public class Fornecedor extends PessoaJuridica{
	@Id @GeneratedValue Long id;
}