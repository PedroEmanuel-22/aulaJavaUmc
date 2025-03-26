package desafio;

public class Mes {

    public double agua;
    public double alimentacao;
    public double luz;

    public double somaGasto(){
        double gastoMes = agua + alimentacao + luz;
        return gastoMes;
    }
}
