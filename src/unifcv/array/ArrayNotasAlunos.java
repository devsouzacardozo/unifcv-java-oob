package unifcv.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNotasAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getArrayNotasAlunos();

	}

	public static void getArrayNotasAlunos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a quantidade de notas!!");

		int quantidade = entrada.nextInt();
		int tamanho = 0;
		int sequencia = 0;

		double[] notas = new double[quantidade];
		tamanho = notas.length;

		for (int i = 0; i < tamanho; i++) {
			sequencia = sequencia + 1;
			System.out.println("Digita a Nota " + sequencia + " : ");
			notas[i] += entrada.nextDouble();

		}
		// System.out.println("Nota" + Arrays.toString(notas));
		double total = 0;
		double media = 0;

		for (double nota : notas) {
			total = total + nota;

		}

		media = total / tamanho;

		System.out.println("Media: " + media);

	}

}
