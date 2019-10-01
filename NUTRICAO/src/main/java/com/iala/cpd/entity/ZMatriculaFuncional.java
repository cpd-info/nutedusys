package com.iala.cpd.entity;

import java.util.Date;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateString;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.type.Vinculo;
import lombok.*;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class ZMatriculaFuncional extends BaseEntity {
	
	private int matricula;
	
	@DateString("dd/MM/YYYY")
	private Date dataAdmissao;
	
	@DateString("dd/MM/YYYY")
	private Date dataExoneracao;
	
	private Vinculo vinculo;
	
	@EqualsAndHashCode.Exclude
	@Relationship(type="TRABALHA_COM", direction = Relationship.INCOMING)
	private ZPessoa funcionario;
	
	@EqualsAndHashCode.Exclude
	@Relationship("OCUPA")
	private ZCargo cargo;
	
	/*@EqualsAndHashCode.Exclude
	@Relationship("LOTADO_EM")
	private Lotacao movimentacao;
	
	@EqualsAndHashCode.Exclude
	@Relationship("REGIME_ESPECIAL")
	private Ret ret;*/

}
