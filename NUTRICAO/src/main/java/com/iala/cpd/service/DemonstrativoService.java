package com.iala.cpd.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.iala.cpd.entity.Setor;
import com.iala.cpd.entity.TotalPorProduto;
import com.iala.cpd.repository.TotalPorProdutoRepository;

@Service
public class DemonstrativoService {	
	@Autowired
	private TotalPorProdutoRepository totalPorProdutoRepository;

	public Table<Integer, String, String> getDemonstrativo(Setor escola, Integer anoLetivo) {

		List<TotalPorProduto> listaTotalPorProduto = this.totalPorProdutoRepository.getTotPorProdList(escola.getId(), anoLetivo);
		Table<Integer, String, String> tabela = HashBasedTable.create();
		IntStream.range(0, listaTotalPorProduto.size()+1).forEach(i -> {
			tabela.put(i, "Descrição", listaTotalPorProduto.get(i).getProduto().getDescricao());
			tabela.put(i, "Quantidade", listaTotalPorProduto.get(i).getQtd().toString());
		});
		return tabela;
	}
}