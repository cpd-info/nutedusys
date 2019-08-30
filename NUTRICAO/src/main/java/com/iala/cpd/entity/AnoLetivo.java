package com.iala.cpd.entity;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import com.iala.cpd.type.DiaSemana;
import com.iala.cpd.type.Turno;
import lombok.Data;

@NodeEntity
@Data
public class AnoLetivo {
	@Id @GeneratedValue Long  id;
	
	private int nome;
	
	private List<Turno> turnos;
	
	private List<DiaSemana> semanas;
	
	public AnoLetivo(int nome, List<Turno> turnos, List<DiaSemana> semanas) {
		this.nome=nome;
		this.turnos=turnos;
		this.semanas=semanas;
	}
	
	public AnoLetivo() {
		
	}
}