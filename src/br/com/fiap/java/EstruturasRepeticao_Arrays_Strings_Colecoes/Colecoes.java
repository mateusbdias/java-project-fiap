package br.com.fiap.java.EstruturasRepeticao_Arrays_Strings_Colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Colecoes {
	
	public static void main(String[] args) {
		
		// ArrayList
		List<String> lista = new ArrayList<>();
		lista.add("LTP");
		lista.add("Web");
		lista.add("Algoritmos");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		int indice = lista.indexOf("Web");
		System.out.println("O valor \"Web\" está na posição " + indice);
		
		// HashSet
		HashSet<String> cursos = new HashSet<>();
		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");
		cursos.add("Java");
		
		System.out.println(cursos);
		
		// HashMap
		HashMap<String, String> mapa = new HashMap<>();
		mapa.put("RM1234", "Thiago");
		mapa.put("RM4321", "João");
		
		System.out.println(mapa);
		System.out.println(mapa.get("RM1234"));
		mapa.remove("RM1234");
		System.out.println(mapa.get("RM1234"));
		
	}

}
