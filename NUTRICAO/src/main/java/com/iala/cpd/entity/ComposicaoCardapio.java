package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import com.iala.cpd.type.DiaSemana;
import com.iala.cpd.type.TipoRefeicao;
import lombok.Data;

@RelationshipEntity("MONTA")
@Data
public class ComposicaoCardapio {
	@Id @GeneratedValue Long id;
	private DiaSemana diaSemana;
	private TipoRefeicao tipoRefeicao;
	
	@StartNode
	private MenuDiario menuDiario;
	
	@EndNode
	private CardapioSemanal cardapioSemanal;
}