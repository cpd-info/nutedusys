package com.iala.cpd.repository;

import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.GeneroLimpeza;

@Repository
public interface GeneroLimpezaRepository extends Neo4jRepository<GeneroLimpeza, Long> {
	@Query("MATCH (prod:GeneroLimpeza) RETURN prod")
	public List<GeneroLimpeza> getAllAlim();
}