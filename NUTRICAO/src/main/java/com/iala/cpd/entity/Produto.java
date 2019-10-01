package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.serviceAbstract.Arrow;
import com.iala.cpd.serviceAbstract.CrudBuilder;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Produto extends BaseEntity implements CrudBuilder{
	private UnidadePadrao unidadePadrao;
	
	@Relationship("CODIGO_NCM")
	private GeneroNCM num_ncm;

	@Override
	public void addTo(Arrow Arrow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFrom(Arrow Arrow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGeneroAlimento(GeneroAlimento generoAlimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMenuDiario(MenuDiario menuDiario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardapioSemanal(CardapioSemanal cardapioSemanal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GeneroAlimento getGeneroAlimento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto getProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuDiario getMenuDiario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardapioSemanal getCardapioSemanal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto getThis() {
		// TODO Auto-generated method stub
		return this;
	}

}