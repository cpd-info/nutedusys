package com.iala.cpd.serviceAbstract;

import com.iala.cpd.entity.CardapioSemanal;
import com.iala.cpd.entity.GeneroAlimento;
import com.iala.cpd.entity.MenuDiario;
import com.iala.cpd.entity.Produto;

public interface CrudBuilder {

	void addTo(Arrow Arrow);
	void removeFrom(Arrow Arrow);
	Object getThis();
	
	void setGeneroAlimento(GeneroAlimento generoAlimento);
	void setProduto(Produto produto);
	void setMenuDiario(MenuDiario menuDiario);
	void setCardapioSemanal(CardapioSemanal cardapioSemanal);
	
	GeneroAlimento getGeneroAlimento();
	Produto getProduto();
	MenuDiario getMenuDiario();
	CardapioSemanal getCardapioSemanal();
}
