package entidades;

public class Moto extends Veiculos {
	
	private int cilindradas;

	public Moto(String marca, String modelo, int ano, double valorDiario, int cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.setCilindradas(cilindradas);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	@Override
	public String toString() {
		return "Dados da Moto \n" +
	"\nMarca: " + getMarca() + 
	"\nModelo: " + getModelo()+
	"\nAno: " + getAno()+
	"\nCilindradas: "+ cilindradas;
	} 
	

}
