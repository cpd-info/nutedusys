package com.iala.cpd.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iala.cpd.entity.CardapioSemanal;
import com.iala.cpd.entity.MenuDiario;
import com.iala.cpd.service.CardapioService;
import com.iala.cpd.service.CurrentDB;
import com.iala.cpd.type.FaixaEtaria;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class Mutation {

	@Autowired
	private CurrentDB cypherRepository;

	@Autowired
	private CardapioService<MenuDiario, Long> menuDiarioService;

	@Autowired
	private CardapioService<CardapioSemanal, Long> cardapioSemanalService;

	@GraphQLMutation
	public String cypher(String query) {
		try {
			cypherRepository.Execute(query);
			return "Query executada com sucesso!";
		} catch (Exception e) {
			return "Erro na execução da tarefa '" + query + "':" + e.getMessage();
		}
	}

	@GraphQLMutation
	public boolean neo4j(String query, String parameter, String value) {
		CurrentDB example = new CurrentDB();

		if (parameter == "") {
			example.Execute(query);
		} else {
			example.Execute(query, parameter, value);
		}

		example.close();
		return true;
	}

	@GraphQLMutation
	public Boolean CriarMenu(String nome, String nome_disfagia, String descricao, FaixaEtaria faixaEtaria) {
		menuDiarioService.novo(new MenuDiario(nome, nome_disfagia, descricao, faixaEtaria));
		return true;
	}

	@GraphQLMutation
	public Boolean CriarCardapio(String nome, String descricao) {
		cardapioSemanalService.novo(new CardapioSemanal(nome, descricao));
		return true;
	}

}