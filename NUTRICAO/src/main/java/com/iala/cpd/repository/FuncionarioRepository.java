package com.iala.cpd.repository;

import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import com.iala.cpd.entity.ZMatriculaFuncional;
import com.iala.cpd.entity.ZPessoa;

@Repository
public interface FuncionarioRepository extends Neo4jRepository<ZMatriculaFuncional, Long>{

	public ZPessoa findAllPessoaByMatricula(int matricula);
	
	@Query("MATCH (q:Pessoa)-[t:TRABALHA_COM]->(p:MatriculaFuncional)-[:OCUPA]->(:Cargo {classe: {0}})-[:SERVE_AO]->(o:Orgao) WHERE Id(o)=130 RETURN p, q, t ORDER BY p.matricula")
	public List<ZMatriculaFuncional> findAllByClasse(String classe);
	
	@Query("MATCH (q:Pessoa)-[t:TRABALHA_COM]->(p:MatriculaFuncional)-[:OCUPA]->(:Cargo {nome: {0}})-[:SERVE_AO]->(o:Orgao) WHERE Id(o)=130 RETURN p, q, t ORDER BY p.matricula")
	public List<ZMatriculaFuncional> findAllByCargo(String cargoNome);
	
	@Query("MATCH (p:MatriculaFuncional)-[:OCUPA]->(:Cargo)-[:SERVE_AO]->(k:Orgao)-[:SUBORDINADO]->(o:Organizacao) WHERE k.nome={0} RETURN p ORDER BY p.matricula")
	public List<ZMatriculaFuncional> findAllFuncionariosBySecretaria(String nomeSecretaria);
	
	@Query("MATCH (e:Setor)<-[l:LOTADO_EM]-(m:MatriculaFuncional)<-[t:TRABALHA_COM]-(p:Pessoa) MATCH (m)-[o:OCUPA]->(c:Cargo) WHERE p.nome={nome} RETURN m, t, p, l, e, o, c")
	public ZMatriculaFuncional findFuncionarioByNome(String nome);
	
	@Query("MATCH (m:MatriculaFuncional)-[l:LOTADO_EM]->(e:Setor) WHERE Id(e)={setorId} AND l.funcaoId={funcaoId1} RETURN m,l,e")
	public List<ZMatriculaFuncional> findAllByLotacao(Long setorId, Long funcaoId1);
}
