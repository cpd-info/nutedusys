package com.iala.cpd.entityAbstract;

import com.iala.cpd.entity.GeneroNCM;
import com.iala.cpd.type.UnidadePadrao;
import lombok.Data;

@Data
public abstract class Produto {
	private String nome;
	private String descricao;
	private UnidadePadrao unidadePadrao;
	private GeneroNCM num_ncm;
}