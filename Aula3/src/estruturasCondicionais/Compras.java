package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informe o valor da sua compra R$: ");
		double valorCompra = sc.nextDouble();
		System.out.println("Metodos Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int metodoPagamento = sc.nextInt();
		switch (metodoPagamento) {
		case 1:
			double valorFinal = valorCompra * 0.9;
			System.out.println("Sua compra ficou R$" + valorFinal);
			break;
		case 2:
			valorFinal = valorCompra * 0.95;
			System.out.println("Sua compra ficou R$" + valorFinal);
			break;
		case 3:
			System.out.println("Metodo parcelamento");
			System.out.println("1 - A vista");
			System.out.println("2 - 2x, 5% de Juros");
			System.out.println("3 - 3x, 10% de Juros");
			int metodosParcelamento = sc.nextInt();
			switch (metodosParcelamento) {
			case 1:
				System.out.println("Sua compra ficou R$" + valorCompra);
				break;
			case 2:
				double valorParcelado = valorCompra * 1.05;
				System.out.printf("Sua compra ficou R$ %.2f\\n" ,valorParcelado);
				break;
			case 3:
				valorParcelado = valorCompra * 1.10;
				System.out.printf("Sua compra ficou R$ %.2f\n" ,valorParcelado);
				break;
			default:
				System.out.printf("Opção Inválida");
				break;
			}
		
		}
		sc.close();
	}
}
