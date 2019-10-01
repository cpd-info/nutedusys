package com.iala.cpd.serviceAbstract;

import com.iala.cpd.entity.CardapioSemanal;
import com.iala.cpd.entity.GeneroAlimento;
import com.iala.cpd.entity.MenuDiario;
import com.iala.cpd.entity.Nutriente;
import com.iala.cpd.entity.Setor;

public interface Arrow {
	MenuDiario getMenuDiario();
	GeneroAlimento getGeneroAlimento();
	CardapioSemanal getCardapioSemanal();
	Setor getSetor();
	Nutriente getNutriente();
	
	void setMenuDiario(MenuDiario menuDiario);
	void setGeneroAlimento(GeneroAlimento generoAlimento);
	void setCardapioSemanal(CardapioSemanal cardapioSemanal);
	void setSetor(Setor setor);
	void setNutriente(Nutriente nutriente);
}
