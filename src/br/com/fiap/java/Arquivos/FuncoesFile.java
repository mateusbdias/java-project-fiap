package br.com.fiap.java.Arquivos;

import java.io.File;
import java.io.IOException;

public class FuncoesFile {
	
	public static void main(String[] args) {
		
		File arquivo = new File("arquivo.txt");
		
		// Verifica se o arquivo existe
		if (arquivo.exists()) {
			System.out.println(
					"O arquivo existe!" + 
					"\nPode ser lido: " + arquivo.canRead() +  
					"\nPode ser gravado: " + arquivo.canWrite() +
					"\nTamanho: " + arquivo.length() + 
					"\n Caminho: " + arquivo.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				else
					System.out.println("Arquivo não criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
