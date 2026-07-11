package Atividades.atividades2;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");

              int numero = scanner.nextInt();

        // Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é Par.");
        } else {
            System.out.println("O número é Ímpar.");
        }

        // Verifica o sinal (positivo, negativo ou zero)
        if (numero > 0) {
            System.out.println("O número é Positivo.");
        }
        else if (numero < 0) {
            System.out.println("O número é Negativo.");
        }
        else {
            System.out.println("O número é Zero.");
        }

        scanner.close();
    }

    }

