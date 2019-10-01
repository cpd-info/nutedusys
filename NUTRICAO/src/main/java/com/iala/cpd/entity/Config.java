package com.iala.cpd.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import com.iala.cpd.entityAbstract.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NodeEntity
@Data
@EqualsAndHashCode(callSuper=false)
public class Config extends BaseEntity {
	private Boolean firstRun;
	
	private Long escolaInep;
	
	private Integer anoLetivo;
	
	public void setConfig(Config conf) {
		if (conf.firstRun != null) {
			this.firstRun=conf.firstRun;
		}
		if (conf.escolaInep != null) {
			this.escolaInep=conf.escolaInep;
		}
	}
}