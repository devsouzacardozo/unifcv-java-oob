package unifcv.matriz;

import java.util.Scanner;

public class MatrizNotasAlunos {

	public static void main(String[] args) {

		getMatriz();
		// calcularMedia();
	}

	public static void getMatriz() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos!!");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Informe a quantidade de notas!!");
		int qtdeNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

		double total = 0;
		double alunos = 0;
		int sequencia = 0;
		double id = sequencia;
		double soma = 0, media = 0;

		for (int a = 0; a < notasDaTurma.length; a++) {
			soma = 0;
			media = 0;
			sequencia = sequencia + 1;
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d : ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				soma += notasDaTurma[a][n];
			}
			media = soma / qtdeNotas;
			System.out.println("Media " + sequencia + ": " + media);

		}

	}

	public static double calcularMedia() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos!!");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Informe a quantidade de notas!!");
		int qtdeNotas = entrada.nextInt();

		int j = 0;
		int i = 0;

		double[][] notas = new double[qtdeAlunos][qtdeNotas];

		double media = 0, soma = 0;

		for (i = 0; i < notas.length; i++) {
			soma = 0;
			media = 0;
			for (j = 0; j < notas.length; j++) {
				System.out.printf("Informe a nota %d do aluno %d", i + 1, j + 1);

				soma = soma + notas[i][j];

			}

			media = soma / 3;
		}
		System.out.println(soma);
		System.out.println(media);
		return media;

	}

}
