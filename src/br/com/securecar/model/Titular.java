package br.com.securecar.model;

public class Titular extends Pessoa {

	private String dataCadastro;
	private String profiss�o;
	private String situa��o;

	/*
	 * M�todos Getter's and Setter's
	 */
	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
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
