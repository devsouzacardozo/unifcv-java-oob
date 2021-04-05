package unifcv.exercicio.atividade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class ContaBancaria {

	public static void main(String[] args) {
		// cadastroCliente();
		contaBancaria();
	}

	private static void cadastroCliente() {

		Map<Integer, String> cadastro = new HashMap<>();

		Scanner cadastrar = new Scanner(System.in);

		System.out.print("Informe número Conta ");
		int conta = cadastrar.nextInt();

		System.out.print("Informe o Cliente ");
		String cliente = cadastrar.next();

		cadastro.put(conta, cliente);
		System.out.println("\n");
		System.out.println("<<<----- Relatório de Cliente ------>\n");
		for (Entry<Integer, String> registro : cadastro.entrySet()) {
			System.out.println("Id: " + registro.getKey() + " Nome: " + registro.getValue());

		}

		System.out.print("Informe número Conta ");
		conta = cadastrar.nextInt();

		System.out.print("Informe o Cliente ");
		cliente = cadastrar.next();

		if (!cadastro.containsKey(conta)) {

			cadastro.put(conta, cliente);

			System.out.println("\n");
			System.out.println("<<<----- Relatório de Cliente ------>\n");
			for (Entry<Integer, String> registro : cadastro.entrySet()) {
				System.out.println("Id: " + registro.getKey() + " Nome: " + registro.getValue());

			}

		} else {

		}

	}

	private static void contaBancaria() {
		Collection<Banco> contaBancaria = new HashSet<>();
		System.out.println("<<<<<<<<<------------- Cadastro de Clientes Premium  ------------>>>>");

		try (Scanner entrada = new Scanner(System.in)) {

			System.out.println("Deseja Cadastrar uma Cliente: ");

			String continuar = entrada.nextLine();
			
			continuar = continuar;

			if (continuar.toUpperCase() == "S" || continuar == "s" ) {
				int sequencia = 1;
				ArrayList<Banco> bancos = new ArrayList<Banco>();
				while (sequencia > 0) {
					System.out.println("Conta: ");
					String conta = entrada.nextLine();

					System.out.println("Nome: ");
					String nome = entrada.nextLine();

					Banco banco = new Banco(conta, nome);
					System.out.println("Cadastrado -> " + banco.toString());
					
				}               
			}

			// while ("S".equalsIgnoreCase(continuar)) {

			System.out.println("Fim Cadastro!!");
			contaBancaria.clear();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
