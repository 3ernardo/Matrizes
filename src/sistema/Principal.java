package sistema;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {

		// reader
		File arquivo = new File("example_4.txt");
		Scanner entrada = new Scanner(arquivo);

		// horizontal
		int x = Integer.parseInt(entrada.next());

		// vertical
		int y = Integer.parseInt(entrada.next());

		// print matrix data
		System.out.println("O arquivo contem uma matriz de " + x + " colunas por " + y + " linhas.");

		// original matrix
		int[][] matrizOriginal = new int[y][x];

		// filling the original matrix
		for (int i = 0; i < y; i++) {
			String[] temp = entrada.next().split("(?<=\\G.)");
			for (int j = 0; j < x; j++)
				matrizOriginal[i][j] = Integer.parseInt(temp[j]);
		}

		// printing the original matrix
		System.out.println();
		System.out.println("Matriz original:");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++)
				System.out.printf("| " + matrizOriginal[i][j] + " ");
			System.out.println("|");
		}

		// creating the 0 to 2 matrix
		System.out.println();
		System.out.println("Matriz 0 por 2:");
		int[][] matrizZeroDois = new int[y][x];
		for (int i = 0; i < y; i++)
			matrizZeroDois[i] = matrizOriginal[i].clone();

		// filling and printing the 0 to 2 matrix
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (matrizZeroDois[i][j] == 0)
					matrizZeroDois[i][j] = 2;
				System.out.printf("| " + matrizZeroDois[i][j] + " ");
			}
			System.out.println("|");
		}

		// creating the 1 to 2 matrix
		System.out.println();
		System.out.println("Matriz 1 por 2:");
		int[][] matrizUmDois = new int[y][x];
		for (int i = 0; i < y; i++)
			matrizUmDois[i] = matrizOriginal[i].clone();

		// filling and printing the 0 to 2 matrix
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (matrizUmDois[i][j] == 1)
					matrizUmDois[i][j] = 2;
				System.out.printf("| " + matrizUmDois[i][j] + " ");
			}
			System.out.println("|");
		}

		// Scanner closure
		entrada.close();

	}

}