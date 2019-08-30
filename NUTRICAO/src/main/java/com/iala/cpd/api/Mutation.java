package com.iala.cpd.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iala.cpd.entity.AnoLetivo;
import com.iala.cpd.repository.AnoLetivoRepository;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import io.leangen.graphql.annotations.GraphQLQuery;

@Service
@GraphQLApi
public class Mutation {
	
	@Autowired
	private AnoLetivoRepository anoLetivoRepository;
	
	@GraphQLQuery
	public AnoLetivo editarAnoLetivo(AnoLetivo anoLetivo) {
		anoLetivoRepository.save(anoLetivo);
		return anoLetivo;
	}

	@GraphQLQuery
	public boolean deletarAnoLetivo(AnoLetivo anoLetivo) {
		anoLetivoRepository.delete(anoLetivo);
		return true;
	}
	
}