package com.iala.cpd.entity;

import java.util.Map;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import lombok.Data;

@RelationshipEntity("COM_ITENS")
@Data
public class TotalPorAlimento {
	@Id @GeneratedValue Long id;
	
	private Map<String, Integer> qtdPorSegmento;
	
	@StartNode
	private DemonstrativoAquisicao aquisicao;
	
	@EndNode
	private GeneroAlimento alimento;
	
	public int quantidade() {
		return this.qtdPorSegmento.values().stream().mapToInt(Integer::intValue).sum();
	}
}