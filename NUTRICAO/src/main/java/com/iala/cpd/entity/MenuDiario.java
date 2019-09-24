package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.type.FaixaEtaria;
import lombok.Data;

//Parte da(s) nutricionista(s)
@NodeEntity
@Data
public class MenuDiario {
	@Id @GeneratedValue Long id;
	private String nome;
	private String nome_desfagia;
	private String descricao;
	private FaixaEtaria faixaEtaria;
	
	@Relationship("COMPOSTO_POR")
	private List<AlimentoDiario> perCapta = new ArrayList<>();
	
	@Relationship("MONTA")
	private List<ComposicaoCardapio> cardapios = new ArrayList<>();
}