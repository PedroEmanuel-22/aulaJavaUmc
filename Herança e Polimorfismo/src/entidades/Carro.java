package entidades;

import servico.Alugado;

public class Carro extends Veiculos implements Alugado{
	//Encapsulamento
	//Atributos
	private boolean arCondicionado;
	

	//Construtor
	public Carro(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	@Override
	public String toString() {
		return "Dados do Carro \n" +
	"Marca: " + getMarca() + 
	"\nModelo " + getModelo()+
	"\nAno: " + getAno()+
	"\nAr Condicionado: "+ arCondicionado;
	} 
	
	public double calcularAluguel(int dias) {
		double valorAluguel;
		
		if(arCondicionado) {
			valorAluguel = getValorDiario() * dias * 1.5;
		}
		else {
			valorAluguel = getValorDiario() * dias;
		}
		
		return valorAluguel;
	}
	
}
