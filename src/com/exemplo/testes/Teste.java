package com.exemplo.testes;

import com.exemplo.entidade.Imovel;
import com.exemplo.repositorio.RepositorioImovel;

public class Teste {

	public static void main(String[] args) {
		
		RepositorioImovel repositorioImovel = new RepositorioImovel();
		Imovel imovel = new Imovel();
		imovel.setCnpj(123456789);
		imovel.setQuant_quartos(3);
		
		repositorioImovel.salvar(imovel);
	}

}
