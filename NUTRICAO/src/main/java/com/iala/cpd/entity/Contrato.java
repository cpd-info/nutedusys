package com.iala.cpd.entity;

import java.util.Date;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateString;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Contrato extends BaseEntity {
	private Integer numero;
	private Float total;
	
	@DateString("dd/MM/YYYY")
	private Date dataInicial;
	
	@DateString("dd/MM/YYYY")
	private Date dataFinal;
	
}