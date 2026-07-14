package Atividades.Atividade3;

import java.util.Scanner;

public class maquinaDoDobro {

    // Método com retorno de valor numérico
    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado = calcularDobro(numero);

        System.out.println("O dobro do número é: " + resultado);

        scanner.close();
    }
}