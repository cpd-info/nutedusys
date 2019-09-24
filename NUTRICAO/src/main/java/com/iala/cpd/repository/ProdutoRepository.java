package com.iala.cpd.repository;

import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.Produto;

@Repository
public interface ProdutoRepository extends Neo4jRepository<Produto, Long> {
	
	@Query("MATCH (prod:Produto) RETURN prod")
	public List<Produto> getAllProd2();
}