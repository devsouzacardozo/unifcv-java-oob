package unifcv.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSetHeterogenio {

	public static void main(String[] args) {
		 hashSetAdd();
		// hashSetRemove();
		//union();
		// clear();

	}

	public static void hashSetAdd() {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Lab. Programa��o Orientada a Objeto.");
		conjunto.add(1);
		conjunto.add('w');

		System.out.println("Quantidade dados: " + conjunto.size());

		conjunto.add("Lab. programa��o Orientada a Objeto."); // Troquei o P Mai�sculo e minusculo ai conta.
		conjunto.add(1);// n�o computa a informa��o igual..

	}

	public static void hashSetRemove() {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Lab. Programa��o Orientada a Objeto.");
		conjunto.add(1);
		conjunto.add('w');

		System.out.println("Quantidade dados: " + conjunto.size());

		conjunto.add("Lab. programa��o Orientada a Objeto."); // Troquei o P Mai�sculo e minusculo ai conta.
		conjunto.add(1);// n�o computa a informa��o igual..

		conjunto.remove(10);

		System.out.println("Conjunto: " + conjunto);
		System.out.println(conjunto.remove(10));

		System.out.println("Contains: " + conjunto.contains('w'));

		// System.out.println("Contains1: "+conjunto.contains('l'));

		System.out.println("Quantidade dados: " + conjunto.size());

		Set numeros = new HashSet();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(5);
		numeros.add(10);
		numeros.add('w');

		conjunto.addAll(numeros);

		System.out.println("unioll: " + conjunto);

		conjunto.retainAll(numeros);

		System.out.println("Resultado interces�o: " + conjunto);
	}

	@SuppressWarnings("unchecked")
	public static void union() {

		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Lab. Programa��o Orientada a Objeto.");
		conjunto.add(1);
		conjunto.add('w');

		@SuppressWarnings("rawtypes")
		Set numeros = new HashSet();

		numeros.add(20);
		numeros.add(21);
		numeros.add(22);
		numeros.add(23);
		numeros.add(24);
		numeros.add('w');

		conjunto.addAll(numeros);

		System.out.println("union: " + conjunto);
	}

	@SuppressWarnings("unchecked")
	public static void intercessao() {

		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Lab. Programa��o Orientada a Objeto.");
		conjunto.add(1);
		conjunto.add('w');
		conjunto.add(10);

		@SuppressWarnings("rawtypes")
		Set numeros = new HashSet();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(5);
		numeros.add(10);
		numeros.add('w');

		conjunto.retainAll(numeros);

		System.out.println("Resultado intercess�o: " + conjunto);
	}

	@SuppressWarnings("unchecked")
	public static void clear() {

		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Lab. Programa��o Orientada a Objeto.");
		conjunto.add(1);
		conjunto.add('w');
		conjunto.add(10);

		@SuppressWarnings("rawtypes")
		Set numeros = new HashSet();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(5);
		numeros.add(10);
		numeros.add('w');

		conjunto.retainAll(numeros);

		System.out.println("Resultado interces�o: " + conjunto);

		conjunto.clear();
		numeros.clear();
		System.out.println("Conjunto Clear: " + conjunto.size() + " Numeros clear: " + numeros.size());
	}

}
