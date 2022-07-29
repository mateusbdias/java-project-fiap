package br.com.fiap.java.EstruturasRepeticao_Arrays_Strings_Colecoes;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[40];
		numeros[0] = 10;
		System.out.println(numeros[0]);
		
		int numerosPreenchido[] = {10, 9, 8, 2};
		System.out.println(numerosPreenchido[2]);
		
		Scanner sc = new Scanner(System.in);
		float notas[] = new float[10];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do aluno:");
			notas[i] = sc.nextFloat();
		}
		sc.close();
		
		float totalNotas = 0;
		for (float nota : notas) {
			totalNotas += nota;
		}
		float mediaNotas = totalNotas / notas.length;
		System.out.println("A média dos alunos é: " + mediaNotas);
		
	}

}
