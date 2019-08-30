package com.iala.cpd.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.Usuario;

@Repository
public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {
	public Usuario findByLogin(String login, @Depth int depth);
}