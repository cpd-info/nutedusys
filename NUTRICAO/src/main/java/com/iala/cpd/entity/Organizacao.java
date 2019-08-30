package com.iala.cpd.entity;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.iala.cpd.model.OrganizacaoModel;

import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Organizacao extends PessoaJuridica {
	@Id @GeneratedValue Long id;
	
	private String nome;
	private String email;
	private String celular;
	private List<String> telefones;
	
	@EqualsAndHashCode.Exclude
	@Relationship(type="SUBORDINADO", direction = Relationship.INCOMING)
	private List<Orgao> orgaos;
	
	public void setTelefone1(String tel) {
		this.telefones.set(0, tel);
	}
	
	public String getTelefone1() {
		return this.telefones.get(0);
	}

	public void setOrganizacao(OrganizacaoModel orgMod) {
		this.setNumero(orgMod.getNumero());
		this.setLogradouro(orgMod.getLogradouro());
		this.setBairro(orgMod.getBairro());
		this.setComplemento(orgMod.getComplemento());
		this.setCep(orgMod.getCep());
		this.setNumero_cnpj(orgMod.getCnpj());
		this.nome=orgMod.getNome();
		this.setNumero_cnpj(orgMod.getCnpj());
		this.telefones=orgMod.getTelefones();
	}
	
}