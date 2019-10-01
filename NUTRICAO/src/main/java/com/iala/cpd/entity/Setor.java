package com.iala.cpd.entity;

import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.iala.cpd.entityAbstract.PessoaJuridica;
import com.iala.cpd.model.EscolaModel;
import com.iala.cpd.type.FaixaEtaria;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper = false)
public class Setor extends PessoaJuridica {
	@Id
	@GeneratedValue
	Long id;

	private String nome;
	private String email;
	private String celular;
	private Long inep;
	private FaixaEtaria faixaEtaria;
	private Integer cardapio_num;

	@EqualsAndHashCode.Exclude
	@Relationship("CONTEMPLA")
	private List<QuantitativoSegmento> alunosPorSegmento = new ArrayList<QuantitativoSegmento>();
	
	@EqualsAndHashCode.Exclude
	@Relationship("RECEBE_ITENS")
	private List<DemonstrativoPorEscola> demonstrativosAnuais = new ArrayList<DemonstrativoPorEscola>();

	private List<String> telefones = new ArrayList<>();

	public Setor(EscolaModel esc) {
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

	public FaixaEtaria getAtualFaixaEtaria() {
		return this.alunosPorSegmento.get(0).getSegmento().getFaixaEtaria();
	}

	public Integer getQuantitativoPorSegmento(Segmento segmento) {
		return this.alunosPorSegmento.stream().filter(qs -> (qs.getSegmento().getId()==segmento.getId())).findFirst().get().getQuantidade_alunos();
	}
	
	public List<Segmento> getSegmentos(){
		List<Segmento> segmentos = new ArrayList<>();
		this.alunosPorSegmento.forEach(aps -> segmentos.add(aps.getSegmento()));
		return segmentos;
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