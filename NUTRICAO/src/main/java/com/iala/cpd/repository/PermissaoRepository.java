package com.iala.cpd.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.Permissao;

@Repository
public interface PermissaoRepository extends Neo4jRepository<Permissao, Long> {
}
