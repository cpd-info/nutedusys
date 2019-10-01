package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.serviceAbstract.Arrow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@RelationshipEntity("COMPOSTO_POR")
@Data
@EqualsAndHashCode(callSuper=false)
public class AlimentoDiario extends BaseEntity implements Arrow {
	private Double quantidade;
	private Double quantidade_disfagia;
	
	@StartNode
	private MenuDiario menuDiario;
	
	@EndNode
	private GeneroAlimento generoAlimento;
	
	public AlimentoDiario(Double quantidade,Double quantidade_disfagia, MenuDiario menuDiario, GeneroAlimento generoAlimento) {
		this.quantidade=quantidade;
		this.quantidade_disfagia=quantidade_disfagia;
		this.menuDiario=menuDiario;
		this.generoAlimento=generoAlimento;
	}

	public CardapioSemanal getCardapioSemanal() {
		return null;
	}

	public void setCardapioSemanal(CardapioSemanal cardapioSemanal) {
		
	}

	@Override
	public Setor getSetor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSetor(Setor setor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nutriente getNutriente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNutriente(Nutriente nutriente) {
		// TODO Auto-generated method stub
		
	}

}