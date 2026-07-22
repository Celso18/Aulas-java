package Aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new MotoACombustao();


        carro.nomeVeículo = "Celtinha";
        carro.ligar();
        carro.ligarArCondicionado();

    }
}
