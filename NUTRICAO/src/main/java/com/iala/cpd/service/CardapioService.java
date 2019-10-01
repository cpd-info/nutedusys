package com.iala.cpd.service;

import java.io.Serializable;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iala.cpd.entityAbstract.BaseEntity;
import com.iala.cpd.repository.Dao;
import com.iala.cpd.serviceAbstract.Arrow;

@Service
public class CardapioService<S extends BaseEntity, ID extends Serializable> {

	@Autowired
	private Dao<S, ID> customDao;
	
	public void novo(S entity) {
		customDao.save(entity);
	}
	
	public void addTo(Long targetId, Arrow source) {
	}
	
	public void removeFrom(Long targetId, Arrow source) {
	}

	public void resultadoEleicaoCardapio(Integer anoLetivo, Map<Long, Integer> cardapiosEscolhidos) {
	}

}