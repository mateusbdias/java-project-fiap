package br.com.fiap.java.Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
	
	public static void main(String[] args) {
	
		try {
			// Abre o arquivo
			FileReader stream = new FileReader("arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);
			
			// Lê uma linha do arquivo
			String linha = reader.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = reader.readLine();
			}
			reader.close();
			
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
