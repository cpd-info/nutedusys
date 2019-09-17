package com.iala.cpd.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.ZPessoa;

@Repository
public interface PessoaRepository extends Neo4jRepository<ZPessoa, Long> {
}