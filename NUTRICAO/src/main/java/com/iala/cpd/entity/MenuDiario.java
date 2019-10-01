package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.serviceAbstract.Arrow;
import com.iala.cpd.serviceAbstract.CrudBuilder;
import com.iala.cpd.type.FaixaEtaria;
import lombok.Data;
import lombok.EqualsAndHashCode;

//Parte da(s) nutricionista(s)
@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class MenuDiario extends BaseEntity implements CrudBuilder{
	private String nome_desfagia;
	private FaixaEtaria faixaEtaria;
	
	@EqualsAndHashCode.Exclude
	@Relationship("COMPOSTO_POR")
	private List<AlimentoDiario> perCapta = new ArrayList<AlimentoDiario>();
	
	@EqualsAndHashCode.Exclude
	@Relationship(type="MONTADO_COM", direction=Relationship.INCOMING)
	private List<ComposicaoCardapio> cardapios = new ArrayList<ComposicaoCardapio>();
	public MenuDiario(String nome, String nome_desfagia, String descricao, FaixaEtaria faixaEtaria) {
		this.setNome(nome);
		this.nome_desfagia=nome_desfagia;	
		this.setDescricao(descricao);	
		this.faixaEtaria=faixaEtaria;
	}
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
	public MenuDiario getThis() {
		// TODO Auto-generated method stub
		return this;
	}
}