package br.com.fiap.java.Excecoes;

import br.com.fiap.java.Banco.Conta;

public class Throws {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		try {
			c.sacar(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		c.depositar(200);
		System.out.println(c.getSaldo());
	}

}
