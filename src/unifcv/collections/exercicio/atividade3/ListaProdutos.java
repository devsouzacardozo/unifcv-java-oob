package unifcv.collections.exercicio.atividade3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import unifcv.collections.Usuario;

public class ListaProdutos {
	public static void main(String[] args) {
		// listaProdutos();
		//AdicionandoProdutosLista();
		// removendoProdutosLista();
		listaProdutosOrder();
		// PerconrrendoLista();
	}

	private static void listaProdutos() {

		ArrayList<Produtos> produtos = new ArrayList<>();

		Produtos prod1 = new Produtos("Pneus Aro 14");
		Produtos prod2 = new Produtos("Água Mineral 5 L");
		Produtos prod3 = new Produtos("Arroz Tio João 5 K");
		Produtos prod4 = new Produtos("Notbook Dell 5 Geração");
		Produtos prod5 = new Produtos("Suco Prats 1,7 L");

		for (Produtos p : produtos) {
			System.out.println("Produtos: " + p.produto);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void AdicionandoProdutosLista() {

		HashSet produtos = new HashSet();

		produtos.add("Pneus aro 14");
		produtos.add("Retrovisor Carro");
		produtos.add("Calota 4 peças");
		produtos.add("Farol Diant. Direito");
		produtos.add("Farol Diant. Esquerdo");

		System.out.println("Produtos: " + produtos);

		System.out.println("Quantidade Produtos: " + produtos.size());

		produtos.add("Lava carro com cera");
		produtos.add("Farol milha");
		produtos.add("Farol Tras. Esquerdo");
		produtos.add("Farol Tras. Direito");

		System.out.println("Produtos: " + produtos);

		System.out.println("Quantidade Produtos: " + produtos.size());

	}

	private static void removendoProdutosLista() {

		ArrayList<Produtos> produtos = new ArrayList<>();

		Produtos prod1 = new Produtos("Pneus Aro 14");
		Produtos prod2 = new Produtos("Água Mineral 5 L");
		Produtos prod3 = new Produtos("Arroz Tio João 5 K");
		Produtos prod4 = new Produtos("Notbook Dell 5 Geração");
		Produtos prod5 = new Produtos("Suco Prats 1,7 L");

		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		produtos.add(prod4);
		produtos.add(prod5);

		produtos.remove(prod1);
		produtos.remove(prod4);

		for (Produtos p : produtos) {
			System.out.println("Produtos: " + p.produto);
		}

	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void PerconrrendoLista() {

		ArrayList<Produtos> produtos = new ArrayList();

		Produtos prod1 = new Produtos("Pneus Aro 14");
		Produtos prod2 = new Produtos("Água Mineral 5 L");
		Produtos prod3 = new Produtos("Arroz Tio João 5 K");
		Produtos prod4 = new Produtos("Notbook Dell 5 Geração");
		Produtos prod5 = new Produtos("Suco Prats 1,7 L");

		for (Produtos p : produtos) {
			System.out.println("Produtos: " + p.produto);
		}

	}

	@SuppressWarnings("rawtypes")
	private static void listaProdutosOrder() {


		Set<String> orderProdutos = new TreeSet<>();
		orderProdutos.add("Pneus Aro 14");
		orderProdutos.add("Água Mineral 5 L");
		orderProdutos.add("Arroz Tio João 5 K");
		orderProdutos.add("Notbook Dell 5 Geração");
		orderProdutos.add("Suco Prats 1,7 L");
		orderProdutos.add("Agua Mineral 5 L");

		for (String p : orderProdutos) {
			System.out.println("Produtos: " + p);
		}

	}

}















