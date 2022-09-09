package br.com.fiap.java.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpresaDBManager {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/fiap", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

}
