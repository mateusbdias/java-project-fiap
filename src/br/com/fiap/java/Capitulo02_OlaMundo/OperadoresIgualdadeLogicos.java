package br.com.fiap.java.Capitulo02_OlaMundo;

public class OperadoresIgualdadeLogicos {
	
	public static void main(String[] args) {
		
		int idade = 71;
		boolean maioridade = idade >= 18;
		System.out.println(maioridade);
		
		boolean precisaVotar = idade >= 18 && idade <= 70;
		System.out.println(precisaVotar);
		
		int x = 8;
		System.out.println(x < 10 || x > 50);
		
		System.out.println(!(idade > 18));
		
	}

}
