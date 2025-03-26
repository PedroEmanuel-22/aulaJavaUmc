package desafio;

public class principal {
    public static void main(String[] args) {
        Mes janeiro = new Mes();
        Mes fevereiro = new Mes();

        //Gasto Janeiro
        janeiro.alimentacao = 1000;
        janeiro.agua = 300;
        janeiro.luz = 300;

        //Gasto Fevereiro
        fevereiro.alimentacao = 1000;
        fevereiro.agua = 300;
        fevereiro.luz = 300;

        //Gasto Total
        double gastoJan = janeiro.somaGasto();
        double gastoFev = fevereiro.somaGasto();

        if (gastoJan > gastoFev) {
            System.out.println("O gasto em janeiro foi maior");
        }
        else if (gastoFev > gastoJan) {
            System.out.println("O gasto em fevereiro foi maior");
        }
        else {
            System.out.println("Ambos os meses tiveram o mesmo gasto");
        }
    }
}
