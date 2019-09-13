package com.iala.cpd.entity;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.iala.cpd.model.EscolaModel;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper = false)
public class Escola extends PessoaJuridica {
	@Id
	@GeneratedValue
	Long id;

	private String nome;
	private String email;
	private String celular;
	private Long inep;

	@Relationship("CARDAPIO_ELEITO")
	private CardapioEscolar escola;
	
	@Relationship("CONTEMPLA")
	private List<Segmento> segmentos;
	
	private List<String> telefones;

	public void setEscola(EscolaModel esc) {
		this.setNumero(esc.getNumero());
		this.setLogradouro(esc.getLogradouro());
		this.setBairro(esc.getBairro());
		this.setComplemento(esc.getComplemento());
		this.setCep(esc.getCep());
		this.setNumero_cnpj(esc.getCnpj());
		this.nome = esc.getNome();
		this.celular = esc.getCelular();
		this.inep = esc.getInep();
		this.telefones = esc.getTelefones();
	}
	
	
	public void setTelefone1(String tel) {
		this.telefones.set(0, tel);
	}

	public String getTelefone1() {
		if (this.telefones.get(0) == null) {
			return "";
		} else {
			return this.telefones.get(0);
		}
	}

}