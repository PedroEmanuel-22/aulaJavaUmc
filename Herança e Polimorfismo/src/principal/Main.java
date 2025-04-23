package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Caminhao;
import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Carro civic = new Carro (null, null, 0 ,0, true);
		
		Moto hornet = new Moto (null, null, 0, 0, 0);

		Caminhao toco = new Caminhao (null, null, 0, 0, false, false);
		
		System.out.println("Coloque as informações do carro: ");
		System.out.println("Ano do carro: ");
		civic.setAno(sc.nextInt());
		System.out.println("Marca do carro: ");
		civic.setMarca(sc.next());
		System.out.println("Modelo do carro: ");
		civic.setModelo(sc.next());
		System.out.println("Valor da diaria: ");
		civic.setValorDiario(sc.nextDouble());
		System.out.println("O carro tem ar condicionado?: ");
		civic.setArCondicionado(sc.nextBoolean());
		
	System.out.println("" + civic.toString());
		
				
				System.out.println("\nColoque as informações da moto: ");
		System.out.println("Ano da moto: ");
		hornet.setAno(sc.nextInt());
		System.out.println("Marca da moto: ");
		hornet.setMarca(sc.next());
		System.out.println("Modelo da moto: ");
		hornet.setModelo(sc.next());
		System.out.println("Valor da diaria: ");
		hornet.setValorDiario(sc.nextDouble());
		System.out.println("Cilindradas: ");
		hornet.setCilindradas(sc.nextInt());
		
		System.out.println("" + hornet.toString());
		
		System.out.println("\nColoque as informações do caminhão: ");
		System.out.println("Ano do caminhão: ");
		toco.setAno(sc.nextInt());
		System.out.println("Marca do caminhão: ");
		toco.setMarca(sc.next());
		System.out.println("Modelo do caminhão: ");
		toco.setModelo(sc.next());
		System.out.println("Valor da diaria: ");
		toco.setValorDiario(sc.nextDouble());
		System.out.println("O caminhão tem ar condicionado?: ");
		toco.setArCondicionado(sc.nextBoolean());
		System.out.println("O caminhão tem báu?: ");
		toco.setBau(sc.nextBoolean());
		
		System.out.println("" + toco.toString());
		
		
		sc.close();
	}

}
