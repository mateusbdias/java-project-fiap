package br.com.fiap.java.Capitulo03_Classes;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.depositar(50.0);
		cc.setAgencia(123);
		cc.setNumero(321);
		
		cc.depositar(100.0);
		
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000.0);
		
		poupanca.retirar(50.0);
		
		System.out.println(poupanca.getSaldo());
		
	}

}
