package com.iala.cpd.entity;

import java.util.Arrays;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.type.FaixaEtaria;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class CardapioEscolar extends BaseEntity {
	private Integer anoLetivo;
	
    //Limitação de lista precisa de testes
	@EqualsAndHashCode.Exclude
	@Relationship("USA_NO_CARDAPIO1")
	private List<CardapioSemanal> cardapio1 = Arrays.asList(new CardapioSemanal[4]);
	
    //Limitação de lista precisa de testes
	@EqualsAndHashCode.Exclude
	@Relationship("USA_NO_CARDAPIO2")
	private List<CardapioSemanal> cardapio2 = Arrays.asList(new CardapioSemanal[4]);
	
	private FaixaEtaria faixaEtaria;
	
	public List<CardapioSemanal> getCardapio(int cardNum){
		if (cardNum==1) {
			return this.cardapio1;
		}else if (cardNum==2){
			return this.cardapio2;
		}else {
			return null;
		}
	}
	
}
