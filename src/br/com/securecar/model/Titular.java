package br.com.securecar.model;

import java.time.LocalDate;

public class Titular extends Pessoa {

	private LocalDate dataCadastro;
	private String profiss�o;
	private String situa��o;

	/*
	 * M�todos Getter's and Setter's
	 */
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getProfiss�o() {
		return profiss�o;
	}

	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	}

	public String getSitua��o() {
		return situa��o;
	}

	public void setSitua��o(String situa��o) {
		this.situa��o = situa��o;
	}

}
