import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
	/*
	 * Ler quantas alturas ser�o inseridas, criar um vetor e depois calcular a m�dia
	 * das alturas
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / n;
		System.out.printf("Valor da m�dia das alturas � igual a: %.2f!" , media);
		sc.close();

	}

}
