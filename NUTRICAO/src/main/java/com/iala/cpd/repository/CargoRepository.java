package com.iala.cpd.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.iala.cpd.entity.Cargo;

@Repository
public interface CargoRepository extends Neo4jRepository<Cargo, Long>{
	public Cargo findAllByNome(String nome);
}
