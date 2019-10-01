package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.serviceAbstract.Arrow;
import com.iala.cpd.type.DiaSemana;
import com.iala.cpd.type.TipoRefeicao;
import lombok.Data;
import lombok.EqualsAndHashCode;

@RelationshipEntity("MONTADO_COM")
@Data
@EqualsAndHashCode(callSuper=false)
public class ComposicaoCardapio extends BaseEntity implements Arrow  {
	private DiaSemana diaSemana;
	private TipoRefeicao tipoRefeicao;
	
	@StartNode
	private CardapioSemanal cardapioSemanal;
	
	@EndNode
	private MenuDiario menuDiario;
	
	public ComposicaoCardapio(DiaSemana diaSemana, TipoRefeicao tipoRefeicao, CardapioSemanal cardapioSemanal, MenuDiario menuDiario) {
		this.diaSemana=diaSemana;
		this.tipoRefeicao=tipoRefeicao;
		this.cardapioSemanal=cardapioSemanal;
		this.menuDiario=menuDiario;
	}

	public GeneroAlimento getGeneroAlimento() {
		return null;
	}

	public void setGeneroAlimento(GeneroAlimento generoAlimento) {
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