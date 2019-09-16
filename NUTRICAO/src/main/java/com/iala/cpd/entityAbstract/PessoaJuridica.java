package com.iala.cpd.entityAbstract;

import java.util.Date;
import org.neo4j.ogm.annotation.typeconversion.DateString;

import com.iala.cpd.entity.Cnae;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public abstract class PessoaJuridica extends Endereco {
	private String numero_cnpj;
	private String nome_fantasia;
	private String razao_social;
	private Cnae codigoCnae;
	@DateString("dd/MM/YYYY")
	private Date data_abertura;
}
