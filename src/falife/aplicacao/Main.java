package falife.aplicacao;

import f4life.Imovel;
import f4life.dao.ImovelDAO;

public class Main {

	public static void main(String[] args) {
		
		ImovelDAO imovelDao = new ImovelDAO();
		
		Imovel imovel = new Imovel();
		imovel.setCnpj(51240290);
		imovel.setQuant_quartos(3); 
		
		imovelDao.save(imovel);
	}

}
