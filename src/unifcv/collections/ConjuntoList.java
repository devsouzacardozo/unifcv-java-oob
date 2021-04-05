package unifcv.collections;

import java.util.ArrayList;

public class ConjuntoList {

	public static void main(String[] args) {
		// listahomogenia();
		listahomogeniaToString();
	}

	public static void listahomogenia() {

		ArrayList<Usuario> listaUsuario = new ArrayList<>();

		Usuario u1 = new Usuario("Anderson Cardozo de Souza");
		Usuario u2 = new Usuario("Samuel Cardozo de Souza");
		Usuario u3 = new Usuario("Samira Cardozo de Souza");
		Usuario u4 = new Usuario("Denise Silva Rodrigues");
		Usuario u5 = new Usuario("Manoel dos Santos");

		listaUsuario.add(u1);
		listaUsuario.add(u2);
		listaUsuario.add(u3);
		listaUsuario.add(u4);
		listaUsuario.add(u5);

		for (Usuario u : listaUsuario) {
			System.out.println("Nome: " + u.nome);

		}
		System.out.println("Nome1: " + listaUsuario.get(0).nome);
		System.out.println("Nome2: " + listaUsuario.get(4).nome);
	}

	public static void listahomogeniaToString() {
		ArrayList<Usuario> listaUsuario = new ArrayList<>();

		Usuario u1 = new Usuario("Anderson Cardozo de Souza");
		Usuario u2 = new Usuario("Samuel Cardozo de Souza");
		Usuario u3 = new Usuario("Samira Cardozo de Souza");
		Usuario u4 = new Usuario("Denise Silva Rodrigues");
		Usuario u5 = new Usuario("Manoel dos Santos");

		listaUsuario.add(u1);
		listaUsuario.add(u2);
		listaUsuario.add(u3);
		listaUsuario.add(u4);
		listaUsuario.add(u5);

		for (Usuario u : listaUsuario) {
			System.out.println(u);

		}
		System.out.println("order 2: "+listaUsuario.get(3));
		System.out.println("order 3: "+listaUsuario.get(4));
	}

}
