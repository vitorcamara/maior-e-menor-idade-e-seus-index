package com.vitorcamara.projetos;

import java.util.Scanner;

public class ColetaDeIndices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];

		for (int i = 0; i < idades.length; i++) {

			System.out.println("Entre com a idade " + (i + 1) + ":");
			idades[i] = scan.nextInt();
		}

		double maiorIdade = idades[0];
		double indexMenor = 0;
		double menorIdade = idades[0];
		double indexMaior = 0;

		for (int i = 1; i < idades.length; i++) {

			if (idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i; // coletando a posição do índice
			} else if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i;
			}

		}

		for (int i = 0; i < idades.length; i++) {

			System.out.println("Idade " + i + ": " + idades[i]);

		}

		System.out.println("Índice da menor idade = " + indexMenor);
		System.out.println("Menor idade = " + menorIdade);
		System.out.println("Índice da maior idade = " + indexMaior);
		System.out.println("Maior idade = " + maiorIdade);

	}
}