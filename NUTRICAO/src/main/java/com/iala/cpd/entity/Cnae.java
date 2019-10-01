package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.iala.cpd.entityAbstract.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Tabela com Código Nacional de Atividades Econômicas (CNAE)
@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Cnae extends BaseEntity {
	@Id @GeneratedValue Long id;
        private String anexo;
        private String codigo;
        private Boolean fator;
        private Boolean atendido;
        private Float aliquota;
}
