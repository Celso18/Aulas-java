package Atividades.atividade5;

import java.util.Scanner;
import java.util.Arrays;

public class SomaVetor {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 1. Declarar vetor de inteiros com tamanho 5
    int[] numeros = new int[5];
    int soma = 0;

    // 2. Laço for para ler os 5 números via Scanner
    System.out.println("Por favor, introduza 5 números inteiros:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
    }

    // 3. Laço para somar todos os elementos do vetor
    for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }

    // 4. Exibir o vetor formatado e o resultado da soma
    System.out.println("\nVetor preenchido: " + Arrays.toString(numeros));
    System.out.println("A soma de todos os elementos é: " + soma);

    scanner.close();
}
}
