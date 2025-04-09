package principal;

import entidades.ContaBancaria;

public class Main {
	private String titular;
	private double saldo;

	public static void main(String[] args) {

		ContaBancaria pedro = new ContaBancaria("pedro",1000);
		
		//Alterando atributo
		//System.out.println(pedro.saldo);
		//Acessando atributo
		//pedro.saldo = 3000;
		
		System.out.println("Titular: " + pedro.getTitular());
		System.out.println("Titular: " + pedro.getSaldo());
		
		//Alterando o atributo privado
		pedro.setTitular("Pedro Emanoel");
		pedro.sacar(1000);
		
		
		System.out.println(pedro.toString());
	}

}
