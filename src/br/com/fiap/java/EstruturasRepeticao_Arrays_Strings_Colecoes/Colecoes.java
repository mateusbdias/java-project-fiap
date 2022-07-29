package br.com.fiap.java.EstruturasRepeticao_Arrays_Strings_Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("LTP");
		lista.add("Web");
		lista.add("Algoritmos");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		int indice = lista.indexOf("Web");
		System.out.println("O valor \"Web\" está na posição " + indice);
		
	}

}
