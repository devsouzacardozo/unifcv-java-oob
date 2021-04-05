package unifcv.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
       
		pilhaLivros();
	}
	
	public static void pilhaLivros() {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Livro de Hist�ria");
		livros.add("Livro de Geografia");
		livros.add("Livro de Ci�ncias");
		livros.add("O Pequeno Principe");
		livros.add("Java Orientado a Objeto");
		livros.add("Delphi para iniciantes");
		
		livros.push("Entendendo as Demostra��es cot�beis Aplicadas ao Setor P�blicos");
		livros.push("O Universo � uma casca de Noz");
		livros.push("O homen de giz");
		livros.push("Battle Royale");
		System.out.println("Quantidade de Livros: "+ livros.size());
		System.out.println("Ultimo Livro da Pilha: "+ livros.element());
		
		System.out.println("Remove livros: "+livros.poll());

		System.out.println("Remove livros pr�ximo: "+livros.poll());  // se tiver vazio trata a excess�o.
		System.out.println("Remove livros pr�ximo: "+livros.remove()); //se tiver vazio gera excess�o.
		System.out.println("Pop ->>>>>. "+livros.pop());  //se tiver vazio gera excess�o.
		System.out.println("Pilha de livros: "+ livros+"\n");
		System.out.println("Cont�m: ->>>>>>>>>>>>>>. "+livros.contains("Livros"));
		
		//foreach pra listagem dos livros
		
		for(String livro: livros) {
			System.out.println("Livros: ->>> "+livro+"\n");
		}
		
		livros.clear();
		System.out.println("Quantidade final Livros: "+livros.size());
		
	}

}
