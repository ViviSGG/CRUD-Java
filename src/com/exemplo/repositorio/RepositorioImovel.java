package com.exemplo.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.exemplo.entidade.Imovel;

public class RepositorioImovel { // classe pra fazer a persistencia do objeto pro banco de dados	
	
	// chamada e gerenciamento do banco de dados, 
	EntityManagerFactory emf; // consultor
	EntityManager em; // transações
	
	//construtor
	public RepositorioImovel () {
		// dentro dele instaciamos os objetos
		emf = Persistence.createEntityManagerFactory("mohr"); // qual unidade de persistencis vai usar pra salvar
		em = emf.createEntityManager();
	}
	
	//método
	public void salvar(Imovel imovel) {
		em.getTransaction().begin(); // abrir conexão com banco de dados
		em.merge(imovel); // se já existe, ele atualiza
		em.getTransaction().commit(); // executar no banco
		emf.close(); //fechar conexão
	}
	
	//método
	public void remover(Imovel imovel) {
		em.getTransaction().begin(); // abrir conexão com banco de dados
		em.remove(imovel);
		em.getTransaction().commit(); // executar no banco
		emf.close(); //fechar conexão
	}
	
	@SuppressWarnings("unchecked")
	public List<Imovel> listarTodos() {
		em.getTransaction().begin(); // abrir conexão com banco de dados
		Query consulta = em.createQuery("select imovel from Imovel imovel");
		List<Imovel> imoveis = consulta.getResultList(); // metodo traz todos os abjetos e associa a lista de imoveis
		em.getTransaction().commit(); // executar no banco
		emf.close(); //fechar conexão
		return imoveis;
	}
}
