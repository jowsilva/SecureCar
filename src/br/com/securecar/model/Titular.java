package br.com.securecar.model;

public class Titular extends Pessoa {

	private String dataCadastro;
	private String profissão;
	private String situação;

	/*
	 * Métodos Getter's and Setter's
	 */
	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
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
