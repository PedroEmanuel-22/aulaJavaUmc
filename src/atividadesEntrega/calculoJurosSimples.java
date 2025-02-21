package atividadesEntrega;

import java.util.Locale;
import java.util.Scanner;

public class calculoJurosSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Coloque o capital inicial: ");
		double c = sc.nextDouble();

		System.out.println("Coloque a Taxa de Juros: ");
		double i = sc.nextDouble();

		System.out.println("Tempo em Meses: ");
		int t = sc.nextInt();

		double j = c * i * t;
		System.out.printf("O montante final vai ser de: %.2f\n", j);

		sc.close();


	}

}
