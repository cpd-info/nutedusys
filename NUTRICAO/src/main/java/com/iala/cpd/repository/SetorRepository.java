package com.iala.cpd.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.Setor;

@Repository
public interface SetorRepository extends Neo4jRepository<Setor, Long> {
}