package br.com.securecar.model;

import java.time.LocalDate;

public class Titular extends Pessoa {

	private LocalDate dataCadastro;
	private String profissão;
	private String situação;

	/*
	 * Métodos Getter's and Setter's
	 */
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

	public String getSituação() {
		return situação;
	}

	public void setSituação(String situação) {
		this.situação = situação;
	}

}
