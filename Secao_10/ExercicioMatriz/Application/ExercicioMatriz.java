package Application;

import java.util.Scanner;

public class ExercicioMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int matriz[][] = new int[n][n];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j)
					System.out.print(matriz[i][j] + " ");
			}
		}
		System.out.println();
		System.out.print("Number of negatives: ");
		int negatives = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0)
					negatives++;
			}
		}
		System.out.println(negatives);
		System.out.println("Matriz:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}
}
