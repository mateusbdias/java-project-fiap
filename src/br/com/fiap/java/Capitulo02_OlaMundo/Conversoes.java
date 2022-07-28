package br.com.fiap.java.Capitulo02_OlaMundo;

public class Conversoes {
	
	public static void main(String[] args) {
		
		int x = 10;
		double d = x;
		long l = x;
		float f = x;
		System.out.println("int: " + x);
		System.out.println("double: " + d);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		
		double valorDouble = 9.99;
		int valorInt = (int)valorDouble;
		System.out.println("valorDouble: " + valorDouble);
		System.out.println("valorInt: " + valorInt);
		
	}

}
