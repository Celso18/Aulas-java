package Atividades.atividade5;

import java.util.Scanner;
import java.util.Arrays;

public class AnalisadorTemperaturas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Declarar vetor de temperaturas
        double[] temperaturas = new double[6];

        // 2. Pedir ao usuário as 6 temperaturas
        System.out.println("Por favor, introduza 6 temperaturas consecutivas:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // 3. Encontrar maior e menor temperatura
        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        // 4. Imprimir resultados
        System.out.println("\nTemperaturas: " + Arrays.toString(temperaturas));
        System.out.println("Maior temperatura: " + maior + " °C");
        System.out.println("Menor temperatura: " + menor + " °C");

        scanner.close();
    }
}
