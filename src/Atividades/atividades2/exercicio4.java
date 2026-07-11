package Atividades.atividades2;

public class exercicio4 {

    public static void main(String[] args) {

        double peso = 70.0;
        double altura = 1.75;

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        }
        else if (imc < 25.0) {
            System.out.println("Peso normal.");
        }
        else if (imc < 30.0) {
            System.out.println("Sobrepeso.");
        }
        else {
            System.out.println("Obesidade.");
        }
    }
}