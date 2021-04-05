package unifcv.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
       
		pilhaLivros();
	}
	
	public static void pilhaLivros() {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Livro de História");
		livros.add("Livro de Geografia");
		livros.add("Livro de Ciências");
		livros.add("O Pequeno Principe");
		livros.add("Java Orientado a Objeto");
		livros.add("Delphi para iniciantes");
		
		livros.push("Entendendo as Demostrações cotábeis Aplicadas ao Setor Públicos");
		livros.push("O Universo é uma casca de Noz");
		livros.push("O homen de giz");
		livros.push("Battle Royale");
		System.out.println("Quantidade de Livros: "+ livros.size());
		System.out.println("Ultimo Livro da Pilha: "+ livros.element());
		
		System.out.println("Remove livros: "+livros.poll());

		System.out.println("Remove livros próximo: "+livros.poll());  // se tiver vazio trata a excessão.
		System.out.println("Remove livros próximo: "+livros.remove()); //se tiver vazio gera excessão.
		System.out.println("Pop ->>>>>. "+livros.pop());  //se tiver vazio gera excessão.
		System.out.println("Pilha de livros: "+ livros+"\n");
		System.out.println("Contém: ->>>>>>>>>>>>>>. "+livros.contains("Livros"));
		
		//foreach pra listagem dos livros
		
		for(String livro: livros) {
			System.out.println("Livros: ->>> "+livro+"\n");
		}
		
		livros.clear();
		System.out.println("Quantidade final Livros: "+livros.size());
		
	}

}
