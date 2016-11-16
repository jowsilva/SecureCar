package br.com.securecar.persistence;

import java.util.Set;

import br.com.securecar.model.Titular;

public interface IPersistenceTitular {
	
	public boolean insert(Titular aluno);
	public boolean delete(Titular aluno);
	public boolean update(Titular aluno);
	public Titular selectTitular(String cpf);
	public Set<Titular> selectAlunos();
	
}
