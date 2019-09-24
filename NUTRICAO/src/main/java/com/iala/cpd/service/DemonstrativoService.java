package com.iala.cpd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.iala.cpd.entity.Setor;
import com.iala.cpd.entity.TotalPorProduto;
import com.iala.cpd.repository.SetorRepository;

@Service
public class DemonstrativoService {	
	@Autowired
	private SetorRepository setorRepository;

	public Table<String, String, String> getDemonstrativo(Setor escola, Integer anoLetivo) {

		List<TotalPorProduto> listaTotalPorProduto = this.setorRepository.getTotPorProdList(escola.getId(), anoLetivo);
		Table<String, String, String> tabela = HashBasedTable.create();
		listaTotalPorProduto.forEach(e -> {
			Integer i=0, j;
			j=i++;
			tabela.put(j.toString(), "Descrição", e.getProduto().getDescricao());
			tabela.put(j.toString(), "Quantidade", e.getQtd().toString());
			e.getProduto().getDescricao();
		});

		return tabela;

	}
}