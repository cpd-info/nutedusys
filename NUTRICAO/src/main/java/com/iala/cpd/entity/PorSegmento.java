package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.serviceAbstract.Arrow;

import lombok.Data;
import lombok.EqualsAndHashCode;

@RelationshipEntity("POR_SEGMENTO")
@Data
@EqualsAndHashCode(callSuper=false)
public class PorSegmento extends BaseEntity implements Arrow {
	
	private Float qtdPorSegmento;
	
	@StartNode
	private TotalPorProduto totalPorProduto;
	
	@EndNode
	private Segmento segmento;

	@Override
	public MenuDiario getMenuDiario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneroAlimento getGeneroAlimento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardapioSemanal getCardapioSemanal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Setor getSetor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nutriente getNutriente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMenuDiario(MenuDiario menuDiario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGeneroAlimento(GeneroAlimento generoAlimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardapioSemanal(CardapioSemanal cardapioSemanal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSetor(Setor setor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNutriente(Nutriente nutriente) {
		// TODO Auto-generated method stub
		
	}
}