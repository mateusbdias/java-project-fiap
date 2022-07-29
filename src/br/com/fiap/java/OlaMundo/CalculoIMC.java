package br.com.fiap.java.OlaMundo;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		
		if(imc >= 40.0) {
			System.out.println("Nível: Obesidade grave");
		} else if(imc >= 30.0 && imc < 40.0) {
			System.out.println("Nível: Obesidade");
		} else if(imc >= 25.0 && imc < 30.0) {
			System.out.println("Nível: Sobrepeso");
		} else if(imc >= 18.5 && imc < 25.0) {
			System.out.println("Nível: Normal");
		} else {
			System.out.println("Valor inválido");
		}
		
		sc.close();
		
	}

}
