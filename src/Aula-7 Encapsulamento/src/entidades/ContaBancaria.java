package entidades;

public class ContaBancaria {
	
	public String titular;
	public double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Getters - permite ler o valor do Atributo
	
	public String getTitular () {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//Setters - Permite alterar o valor do Atributo
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodo - Depositar
	public void depositar(double valor) {
		if (valor > 0 ) {
			this.saldo += valor;
		}else {
			System.out.println("Informe um valor válido");
		}
	}
	
	//Metodo - Sacar
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("O valor do Saque é maior que o saldo da conta");
		}else {
			this.saldo -= valor;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Titular: " + titular + "\nSaldo: R$" + saldo;
	}
	
}
