package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/* LOAD CSV FROM 'file:///file.csv' AS line
CREATE (:Tabela {campo1: line[0], campo2: line[1], campo3: line[2], num: TOINTEGER(line[3])})

*/

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Localidade extends BaseEntity {
	private int cod;
	
	@Relationship("PERTENCE_A")
	private Estado estado;
}
