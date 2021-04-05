package unifcv.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoSetHomogenio {
	public static void main(String[] args) {
		// lista();
		// listaOrdenada();
		// listaOrdenada1();
		// listaNumerosOrdenados();
		// listaNumerosOrdenados1();
		listaNumerosOrdenados2();
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void lista() {

		@SuppressWarnings("unchecked")
		Set<String> listaAprovados = new HashSet<>();

		listaAprovados.add("Anderson");
		listaAprovados.add("Tiago");
		listaAprovados.add("Ana Maria");
		listaAprovados.add("Roberto Silva");
		listaAprovados.add("Manoel Silva");
		listaAprovados.add("João Paulo");
		int sequencia = 0;
		for (String candidato : listaAprovados) {
			sequencia = sequencia + 1;
			System.out.println("candidato " + sequencia + ": " + candidato);

		}

		System.out.println("Lista de nomes: " + listaAprovados);
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void listaOrdenada() {

		@SuppressWarnings("unchecked")
		Set<String> listaAprovados = new TreeSet<>(); // TreeSet ordena a lista order crescente

		listaAprovados.add("Anderson Silva");
		listaAprovados.add("Tiago");
		listaAprovados.add("Pedro da Silva");
		listaAprovados.add("Anderson Souza");
		listaAprovados.add("Ana Maria");
		listaAprovados.add("Roberto Silva");
		listaAprovados.add("Manoel Silva");
		listaAprovados.add("João Paulo");
		
		int sequencia = 0;
		for (String candidato : listaAprovados) {
			sequencia = sequencia + 1;
			System.out.println("candidato " + sequencia + ": " + candidato);

		}

		System.out.println("Lista de nomes: " + listaAprovados);
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void listaOrdenada1() {

		@SuppressWarnings("unchecked")
		TreeSet<String> listaAprovados = new TreeSet<>(); // TreeSet ordena a lista order crescente

		listaAprovados.add("Anderson Silva");
		listaAprovados.add("Tiago");
		listaAprovados.add("Pedro da Silva");
		listaAprovados.add("Anderson Souza");
		listaAprovados.add("Ana Maria");
		listaAprovados.add("Roberto Silva");
		listaAprovados.add("Manoel Silva");
		listaAprovados.add("João Paulo");
		int sequencia = 0;
		for (String candidato : listaAprovados) {
			sequencia = sequencia + 1;
			System.out.println("candidato " + sequencia + ": " + candidato);

		}

		System.out.println("Lista de nomes: " + listaAprovados);
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void listaNumerosOrdenados() {

		@SuppressWarnings("unchecked")
		Set<String> listaAprovados = new TreeSet<>(); // TreeSet ordena a lista order crescente

		listaAprovados.add("1");
		listaAprovados.add("4");
		listaAprovados.add("5");
		listaAprovados.add("7");
		listaAprovados.add("10");
		listaAprovados.add("2");
		listaAprovados.add("3");
		listaAprovados.add("6");
		int sequencia = 0;
		for (String candidato : listaAprovados) {
			sequencia = sequencia + 1;
			System.out.println("candidato " + sequencia + ": " + candidato);

		}

		System.out.println("Lista de nomes: " + listaAprovados);
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void listaNumerosOrdenados1() {

		@SuppressWarnings("unchecked")
		Set<Integer> listaAprovados = new TreeSet(); // TreeSet ordena a lista order crescente

		listaAprovados.add(1);
		listaAprovados.add(4);
		listaAprovados.add(5);
		listaAprovados.add(7);
		listaAprovados.add(10);
		listaAprovados.add(2);
		listaAprovados.add(3);
		listaAprovados.add(6);
		int sequencia = 0;
		for (Integer candidato : listaAprovados) {
			sequencia = sequencia + 1;
			System.out.println("candidato " + sequencia + ": " + candidato);

		}

		System.out.println("Lista de nomes: " + listaAprovados);
	}

	@SuppressWarnings("unchecked")
	public static void listaNumerosOrdenados2() {

		@SuppressWarnings("rawtypes")
		TreeSet<Integer> listaAprovados = new TreeSet(); // TreeSet ordena a lista order crescente

		listaAprovados.add(1);
		listaAprovados.add(4);
		listaAprovados.add(7);
		listaAprovados.add(5);
		listaAprovados.add(10);
		listaAprovados.add(2);
		listaAprovados.add(3);
		listaAprovados.add(6);

		int sequencia = 0;

		for (Integer candidato : listaAprovados) {
			sequencia = sequencia + 1;
			System.out.println("candidato " + sequencia + ": " + candidato);

		}

		System.out.println("Lista de nomes: " + listaAprovados);
	}

}
