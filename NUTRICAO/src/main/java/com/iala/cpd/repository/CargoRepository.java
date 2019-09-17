package com.iala.cpd.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.ZCargo;

@Repository
public interface CargoRepository extends Neo4jRepository<ZCargo, Long>{
	public ZCargo findAllByNome(String nome);
}
