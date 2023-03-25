package com.exemplo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //vai ser gerenciado como uma entidade
@Table(name="imovel")  // vai ser uma tabela banco de dados

public class Imovel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // valor incremental, gerenciado pelo sql
	private int id;
	
	@Column
	private int cnpj;
	@Column
	private int quant_quartos;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getQuant_quartos() {
		return quant_quartos;
	}
	public void setQuant_quartos(int quant_quartos) {
		this.quant_quartos = quant_quartos;
	}
	

	
}
