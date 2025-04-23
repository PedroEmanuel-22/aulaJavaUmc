package entidades;

import servico.Alugado;

public class Veiculos implements Alugado{
	
	//Atributos
	private String marca;
	private String modelo;
	private int ano;
	private double valorDiario;
	
//Construtores
	public Veiculos(String marca, String modelo, int ano, double valorDiario) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiario = valorDiario;
	}
	//Getters e Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorDiario() {
		return valorDiario;
	}

	public void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
	
	//toString

	public String toString() {
		return "Veiculos [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", valorDiario=" + valorDiario
				+ "]";
	}

	public double calcularAluguel(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
