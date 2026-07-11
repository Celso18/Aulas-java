package Atividades.atividades2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de Média Escolar ===\n");

        // Entrada das notas (pode ser digitado pelo usuário)
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;

        // Saída formatada
        System.out.printf("\nMédia: %.2f%n", media);

        // Condições corretas
        if (media >= 7.0) {
            System.out.println("Aprovado!");
        }
        else if (media >= 5.0) {
            System.out.println("Em Recuperação.");
        }
        else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}