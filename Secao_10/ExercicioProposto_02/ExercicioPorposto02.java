import java.util.Scanner;

public class ExercicioPorposto02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int number = sc.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (number == matrix[i][j]) {
					System.out.println("Position: " + i + "," + j);
					if ((j - 1) >= 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if ((j + 1) < matrix[i].length) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if ((i - 1) >= 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if ((i + 1) < matrix.length) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}

					System.out.println("----------------------------");
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
