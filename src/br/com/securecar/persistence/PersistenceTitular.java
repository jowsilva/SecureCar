package br.com.securecar.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import br.com.securecar.model.Titular;

public class PersistenceTitular implements IPersistenceTitular {

	private static Statement stmt;
	private static ResultSet rs;
	private static Conexao con = new Conexao();

	@Override
	public boolean insert(Titular titular) {

		try {

			stmt = con.getConnection().createStatement();

			String sql = "INSERT INTO ...";

			rs = stmt.executeQuery(sql);

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean delete(Titular titular) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Titular titular) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Titular selectTitular(String cpf) {
		Titular titular = new Titular();

		try {

			stmt = con.getConnection().createStatement();

			String sql = "SELECT * FROM tabela WHERE cpf='0123456789'";

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				titular.setCpf(rs.getString("cpf"));
				titular.setNome(rs.getString("nome"));
			}

			return titular;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Set<Titular> selectAlunos() {
		// TODO Auto-generated method stub
		return null;
	}

}
