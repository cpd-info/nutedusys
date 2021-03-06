package com.iala.cpd.model;

import java.time.LocalDate;
import java.util.List;
import com.iala.cpd.entity.Setor;
import lombok.Data;

//POJO para escola.html
@Data
public class EscolaModel {
 
	private Long id;
	private String nome;
	private String cnpj;
	private Long localidadeId;
	private Long ufId;
	private Long organizacaoId;
	private Long diretorId;
	private Long secretarioId;
	private String celular;
	private Long inep;
	private List<String> telefones;
	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	private String cep;
	
	public EscolaModel(){
		System.out.println("(EscolaModel) Passei " + LocalDate.now());
	}
 
	public EscolaModel(Setor esc) {
		super();
		this.id = esc.getId();
		this.nome = esc.getNome();
		this.localidadeId = esc.getLocalidade().getId();
		this.ufId = esc.getLocalidade().getEstado().getId();
		this.celular = esc.getCelular();
		this.inep = esc.getInep();
		this.cnpj = esc.getNumero_cnpj();
		this.telefones = esc.getTelefones();
		this.logradouro = esc.getLogradouro();
		this.numero = esc.getNumero();
		this.bairro = esc.getBairro();
		this.complemento = esc.getComplemento();
		this.cep = esc.getCep();
	}
}