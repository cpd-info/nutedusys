package com.iala.cpd.api;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.iala.cpd.entity.Config;
import com.iala.cpd.entity.Estado;
import com.iala.cpd.entity.Grupo;
import com.iala.cpd.entity.Localidade;
import com.iala.cpd.entity.Usuario;
import com.iala.cpd.repository.ConfigRepository;
import com.iala.cpd.repository.GrupoRepository;
import com.iala.cpd.repository.LocalidadeRepository;
import com.iala.cpd.repository.EstadoRepository;
import com.iala.cpd.repository.UsuarioRepository;
import com.iala.cpd.type.DiaSemana;
import com.iala.cpd.type.Etnia;
import com.iala.cpd.type.Turno;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class Query {


	@Autowired
	private GrupoRepository grupoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private ConfigRepository configRepository;

	@Autowired
	private LocalidadeRepository localidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	// LOCALIDADE
	@GraphQLQuery
	public List<Localidade> filtrarMunicipioByUfSigla(String uf) {
		return localidadeRepository.findByUf(uf);
	}

	@GraphQLQuery
	public List<Localidade> filtrarMunicipioByUfId(Long ufid) {
		return localidadeRepository.findByUfId(ufid);
	}

	@GraphQLQuery
	public List<Localidade> filtrarMunicipioByIbge(int cod) {
		return localidadeRepository.findByCod(cod);
	}
	
	@GraphQLQuery
	public Iterable<Estado> obterListaUFBR() {
		return estadoRepository.findAllByPais("Brasil");
	}


	/*// FUNCIONARIOS
	@GraphQLQuery
	public MatriculaFuncional obterFuncionario(String nome) {
		return funcionarioRepository.findFuncionarioByNome(nome);
	}

	@GraphQLQuery
	public Iterable<MatriculaFuncional> obterFuncionarios() {
		return funcionarioRepository.findAll(2);
	}

	@GraphQLQuery
	public Iterable<MatriculaFuncional> obterFuncionarios(String nomeSecretaria) {
		return funcionarioRepository.findAllFuncionariosBySecretaria(nomeSecretaria);
	}
	
	@GraphQLQuery
	public Iterable<MatriculaFuncional> obterPorClasse(String classe) {
		return funcionarioRepository.findAllByClasse(classe);
	}*/


	// TIPOS

	@GraphQLQuery
	public List<DiaSemana> semanas() {
		return Arrays.asList(DiaSemana.values());
	}

	@GraphQLQuery
	public List<Turno> turnos() {
		return Arrays.asList(Turno.values());
	}

	@GraphQLQuery
	public List<Etnia> etnia() {
		return Arrays.asList(Etnia.values());
	}

	// USER

	@GraphQLQuery
	public Iterable<Usuario> obterUsuarios() {
		return usuarioRepository.findAll(2);
	}

	@GraphQLQuery
	public String currentUserName() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

	@GraphQLQuery
	public Iterable<Grupo> obterGrupos() {
		return grupoRepository.findAll();
	}

	@GraphQLQuery
	public Usuario obterUsuario(String login) {
		return usuarioRepository.findByLogin(login, 2);
	}

	// SYSTEM CONFIG

	@GraphQLQuery
	public String setConfig(Config conf) {
		return "";
	};
	
	@GraphQLQuery
	public Boolean firstRun(Boolean set) {
		Config cfg = configRepository.get();
		Boolean fr = cfg.getFirstRun();
		if (set != null) {
			cfg.setFirstRun(set);
			configRepository.save(cfg);
		}
		return fr;
	}

}