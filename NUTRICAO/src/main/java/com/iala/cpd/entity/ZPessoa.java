package com.iala.cpd.entity;

import java.util.Date;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateString;
import com.iala.cpd.entityAbstract.PessoaFisica;
import com.iala.cpd.type.Etnia;
import com.iala.cpd.type.Sexo;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class ZPessoa extends PessoaFisica {
	
	@DateString("dd/MM/YYYY")
	private Date nascimento;
	private Sexo sexo;
	private Etnia cor;
	
	@Relationship("TEM_SANGUE")
	private TipoSang tiposang;
	private String email;
	private String situacao;
	private String obs;
	private List<String> telefones;
	private String cursos;
	
	@Relationship(type="PAI", direction = Relationship.INCOMING)
	private ZPessoa pai;
	
	@Relationship(type="MAE", direction = Relationship.INCOMING)
	private ZPessoa mae;
	
	@Relationship("NATIVO_EM")
	private Localidade naturalidade;
	
	@Relationship("CIDADAO_DE")
	private Pais nacionalidade;
}
