package com.iala.cpd.repository;

import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.TotalPorProduto;

@Repository
public interface TotalPorProdutoRepository extends Neo4jRepository<TotalPorProduto, Long> {
	@Query("MATCH (s:Setor)-[:RECEBE_ITENS]->(d:DemonstrativoPorEscola)-[:CONSTANDO]->(t:TotalPorProduto)-[ps:POR_SEGMENTO]->(s:Segmento) WHERE Id(s)={setorId} AND s.anoLetivo={anoLetivo} RETURN t, ps, s")
	List<TotalPorProduto> getTotPorProdList(Long setorId, Integer anoLetivo);
}