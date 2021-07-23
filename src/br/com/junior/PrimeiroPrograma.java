package br.com.junior;

import br.com.junior.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		Gato gato = new Gato();
		
		System.out.println(livro);
		System.out.println(gato);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World!! " + (a+b));*/
		

	}

}

class Livro{
	
	private String nome;
	private Integer nPag;
}
