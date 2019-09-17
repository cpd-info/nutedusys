package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import lombok.Data;

//Tabela com Código Nacional de Atividades Econômicas (CNAE)
@NodeEntity
@Data
public class Cnae {
	@Id @GeneratedValue Long id;
        private String descricao;
        private String anexo;
        private String codigo;
        private Boolean fator;
        private Boolean atendido;
        private Float aliquota;
}
