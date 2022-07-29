package br.com.fiap.java.EstruturasRepeticao_Arrays_Strings_Colecoes;

public class Strings {
	
	public static void main(String[] args) {
		
		System.out.println("FIAP \nA melhor faculdade de tecnologia");
		System.out.println("Faculdade: \"FIAP\"");
		System.out.println("\\n\tNova linha\n\tPosiciona o cursor no início da próxima linha");
		System.out.println("\\t\tTabulação horizontal\n\tMove o cursor para a próxima posição da tabulação horizontal");
		System.out.println("\\\\\tBarra invertida\n\tUtilizada para gerar um caractere de barra invertida");
		System.out.println("\\\"\tAspas duplas\n\tUtilizada para gerar um caractere de aspas duplas");
		System.out.println("\\\'\tAspas simples\n\tUtilizada para gerar um caractere de aspas simples");
		
		
		String nome = "FIAP";
		String slogan = "A melhor faculdade de tecnologia";
		
		// Concatenação
		// Método 1
		String faculdade1 = nome + " - " + slogan;
		
		// Método 2
		String faculdade2 = nome;
		faculdade2 += " - ";
		faculdade2 += slogan;
		
		// Método 3
		String faculdade3 = nome.concat(" - ").concat(slogan);
		
		System.out.println("====================================");
		System.out.println("Concatenação");
		System.out.println("Método 1: " + faculdade1);
		System.out.println("Método 2: " + faculdade2);
		System.out.println("Método 3: " + faculdade3);
		System.out.println("====================================");
		
		// Método equals()
		String nome1 = "FIAP";
		String nome2 = "fiap";
		if (nome1.equals(nome2)) {
			System.out.println("As Strings são iguais");
		} else {
			System.out.println("As Strings são diferentes");
		}
		
		// Método equalsIgnoreCase()
		if (nome1.equalsIgnoreCase(nome2)) {
			System.out.println("As Strings são iguais");
		} else {
			System.out.println("As Strings são diferentes");
		}
		
		// Método startsWith()
		String facu = "FIAP - A melhor faculdade de tecnologia";
		if (facu.startsWith("FIAP")) {
			System.out.println("A String começa com \"FIAP\"");
		} else {
			System.out.println("A String não começa com \"FIAP\"");
		}
		
		// Método endsWith()
		if (facu.endsWith("FIAP")) {
			System.out.println("A String termina com \"FIAP\"");
		} else {
			System.out.println("A String não termina com \"FIAP\"");
		}
		
		// Método length()
		int caracteres = facu.length();
		System.out.println("A String possui " + caracteres + " caracteres");
		
		// Método charAt()
		char caractere = facu.charAt(1);
		System.out.println("O segundo caractere da string é " + caractere);
		
		// Método indexOf()
		int posicaoA = facu.indexOf('a');
		System.out.println("O índice do caractere 'a' na string é " + posicaoA);
		int posicaoX = facu.indexOf('x');
		System.out.println("O índice do caractere 'x' na string é " + posicaoX);
		int posicaoFaculdade = facu.indexOf("faculdade");
		System.out.println("O índice da palavra \"faculdade\" na string é " + posicaoFaculdade);
		
		// Método lastIndexOf()
		int ultimaPosicaoA = facu.lastIndexOf('a');
		System.out.println("O índice do último caractere 'a' na string é " + ultimaPosicaoA);
		
		// Método substring()
		String nova1 = facu.substring(16, 25);
		System.out.println("A nova string é: " + nova1);
		String nova2 = facu.substring(facu.indexOf('m'), 25);
		System.out.println("A nova string é: " + nova2);
		String nova3 = facu.substring(16);
		System.out.println("A nova string é: " + nova3);
		
		// Métodos toUpperCase() e toLowerCase()
		String facuUpper = facu.toUpperCase();
		System.out.println("Upper Case: " + facuUpper);
		String facuLower = facu.toLowerCase();
		System.out.println("Lower Case: " + facuLower);
		
		// Método replace()
		String facuX = facu.replace('a', 'x');
		System.out.println("A nova string é: " + facuX);
		String facuSP = facu.replace("tecnologia", "São Paulo");
		System.out.println("A nova string é: " + facuSP);
		
		// Método split()
		String[] palavras = facu.split(" ");
		for (String p : palavras) {
		    System.out.println(p);
		}
		
	}

}
