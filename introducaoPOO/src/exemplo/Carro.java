package exemplo;

public class Carro {
    double motor;
    String fabricante;
    String modelo;
    int ano;
    String cor;
    String placa;
    int velocidade;

    public void exibirInfo () {
        System.out.println(
            "Fabricante: " + fabricante +
            "\nModelo: " + modelo +
            "\nCor: " + cor +
            "\nAno: " + ano +
            "\nPlaca: " + placa +
            "\nMotor: " + motor +
            "\nVelocidade: " + velocidade 
        );
    }
    public void acelera(int vel){
        velocidade = velocidade + vel;
    }
    public void freia(int vel){
        velocidade = velocidade - vel;
    }
}
