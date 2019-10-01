package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import com.iala.cpd.entityAbstract.PessoaJuridica;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Fornecedor extends PessoaJuridica{
}
