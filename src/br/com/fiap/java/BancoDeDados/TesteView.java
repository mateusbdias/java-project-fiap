package br.com.fiap.java.BancoDeDados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteView {
	
	public static void main(String[] args) {
		
		try {
			// Registra o Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Abre uma conexão
			Connection conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/fiap", "root", "");
			
			System.out.println("Conectado!");
			
			// Insere um registro
			PreparedStatement stmt = conexao.prepareStatement(
					"INSERT INTO tab_colaborador (nome, email, salario, data_contratacao) VALUES (?, ?, ?, ?)");
			stmt.setString(1, "Thiago");
			stmt.setString(2, "thiago@gmail.com");
			stmt.setDouble(3, 200.65);
			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			stmt.setDate(4, data);
			stmt.executeUpdate();
			
			// Faz uma consulta à tabela
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM tab_colaborador");
			
			// Percorre todos os registros encontrados
			while (rs.next()) {
				// Recupera os valores de cada coluna
				int codigo = rs.getInt("codigo_colaborador");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				double salario = rs.getDouble("salario");
				java.sql.Date dataContratacao = rs.getDate("data_contratacao");
				// Exibe as informações do registro
				System.out.println(
						codigo + " " + 
						nome + " " + 
						email + " " + 
						salario + " " +
						dataContratacao);
			}
			
			//Fecha a conexão
			conexao.close();
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar ao Banco de Dados");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
		
	}

}
