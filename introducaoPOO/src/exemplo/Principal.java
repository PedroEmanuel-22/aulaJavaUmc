package exemplo;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro civic = new Carro();
        civic.fabricante = "Honda";
        civic.modelo = "Civic";
        civic.motor = 2.0;
        civic.placa = "EIC - 2490";
        civic.cor = "Preta";
        civic.ano = 2024;
        civic.velocidade = 0;
        civic.exibirInfo();
        
        
        sc.close();
    }
}
