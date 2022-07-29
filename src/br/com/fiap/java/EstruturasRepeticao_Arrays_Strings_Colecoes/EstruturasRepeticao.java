package br.com.fiap.java.EstruturasRepeticao_Arrays_Strings_Colecoes;

import java.util.Scanner;

public class EstruturasRepeticao {
	
	public static void main(String[] args) {
		
		// While
		int numero = 0;
		while (numero < 10) {
			numero += 1;
			System.out.println(numero);
		}
		
		// Do-While
		Scanner sc = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Digite um número");
			int n1 = sc.nextInt();
			System.out.println("Digite outro número");
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println("A soma é " + soma);
			System.out.println("Deseja somar outros números?");
			opcao = sc.next().toUpperCase();
		} while (opcao.equals("S"));
		sc.close();
		
		// For
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
	}

}
