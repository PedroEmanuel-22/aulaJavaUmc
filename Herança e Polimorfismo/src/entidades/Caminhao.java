package entidades;



public class Caminhao extends Veiculos{
	
	private boolean arCondicionado;
	private boolean bau;
	
	public Caminhao(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado, boolean bau) {
		super(marca, modelo, ano, valorDiario);
		// TODO Auto-generated constructor stub
		this.setArCondicionado(arCondicionado);
		this.setBau(bau);
			
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isBau() {
		return bau;
	}

	public void setBau(boolean bau) {
		this.bau = bau;
	}
	
	public String toString() {
		return "Dados do Caminhao \n" +
	"Marca: " + getMarca() + 
	"\nModelo " + getModelo()+
	"\nAno: " + getAno()+
	"\nAr Condicionado: "+ arCondicionado +
	"\n Bau: "+bau;
	} 
	
}
