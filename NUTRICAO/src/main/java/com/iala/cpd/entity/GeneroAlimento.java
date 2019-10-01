package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneroAlimento extends Produto{
	//Densidade em KG/L
	private Double densidade;
	private String validade;
	
	@EqualsAndHashCode.Exclude
	@Relationship("VALOR_NUTRICIONAL")
	private List<ValorNutricional> valorNutricional = new ArrayList<ValorNutricional>();
	
	public GeneroAlimento(String nome, Double densidade, String validade, UnidadePadrao unidadePadrao) {
		this.densidade=densidade;
		this.validade=validade;
		this.setNome(nome);
		this.setUnidadePadrao(unidadePadrao);
	}
}