package br.com.fiap.java.BancoDeDados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ColaboradorDAO {
	
	private Connection conexao;
	
	public void cadastrar(Colaborador colaborador) {
		PreparedStatement ps = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			String sql = "INSERT INTO tab_colaborador (nome, email, salario, data_contratacao) VALUES (?, ?, ?, ?)";
			ps = conexao.prepareStatement(sql);
			ps.setString(1, colaborador.getNome());
			ps.setString(2, colaborador.getEmail());
			ps.setDouble(3, colaborador.getSalario());
			Date data = new Date(colaborador.getDataContratacao().getTimeInMillis());
			ps.setDate(4, data);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Colaborador> listar() {
		// Cria uma lista de colaboradores
		List<Colaborador> lista = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conexao = EmpresaDBManager.obterConexao();
			ps = conexao.prepareStatement("SELECT * FROM tab_colaborador");
			rs = ps.executeQuery();
			
			// Percorre todos os registros encontrados
			while (rs.next()) {
				int codigo = rs.getInt("codigo_colaborador");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				double salario = rs.getDouble("salario");
				Date data = rs.getDate("data_contratacao");
				Calendar dataContratacao = Calendar.getInstance();
				dataContratacao.setTimeInMillis(data.getTime());
				// Cria um objeto Colaborador com as informações encontradas
				Colaborador colaborador = new Colaborador(codigo, nome, email, salario, dataContratacao);
				// Adiciona o colaborador à lista
				lista.add(colaborador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}
	
	public void remover(int codigo) {
		PreparedStatement ps = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			String sql = "DELETE FROM tab_colaborador WHERE codigo_colaborador = ?";
			ps = conexao.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Colaborador buscarPorId(int codigoBusca) {
		Colaborador colaborador = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			ps = conexao.prepareStatement("SELECT * FROM tab_colaborador WHERE codigo_colaborador = ?");
			ps.setInt(1, codigoBusca);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				int codigo = rs.getInt("codigo_colaborador");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				double salario = rs.getDouble("salario");
				Date data = rs.getDate("data_contratacao");
				Calendar dataContratacao = Calendar.getInstance();
				dataContratacao.setTimeInMillis(data.getTime());
				colaborador = new Colaborador(codigo, nome, email, salario, dataContratacao);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return colaborador;
	}
	
	public void atualizar(Colaborador colaborador) {
		PreparedStatement ps = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			String sql = "UPDATE tab_colaborador SET nome = ?, email = ?, salario = ?, data_contratacao = ? WHERE codigo_colaborador = ?";
			ps = conexao.prepareStatement(sql);
			ps.setString(1, colaborador.getNome());
			ps.setString(2, colaborador.getEmail());
			ps.setDouble(3, colaborador.getSalario());
			Date data = new Date(colaborador.getDataContratacao().getTimeInMillis());
			ps.setDate(4, data);
			ps.setInt(5, colaborador.getCodigo());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
