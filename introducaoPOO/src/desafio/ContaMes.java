package desafio;

public class ContaMes {
    public static void main(String[] args) {
        double janAlim, janLuz, janAgua, fevAlim, fevLuz, fevAgua;

        //Gasto Janeiro
        janAlim = 1500;
        janAgua = 300;
        janLuz = 300;

        //Gasto fevereiro
        fevAlim = 1500;
        fevAgua = 300;
        fevLuz = 300;

        double gastoTotalJan = janAgua + janAlim + janLuz;
        double gastoTotalFev = fevAgua + fevAlim + fevLuz;

        if (gastoTotalJan > gastoTotalFev) {
            System.out.println("O gasto de Janeiro foi maior.");
        }

        else if (gastoTotalFev > gastoTotalJan) {
            System.out.println("O gasto de Fevereiro foi maior");
        }

        else {
            System.out.println("Ambos os meses tiverem o mesmo gasto");
        }
    }
}
