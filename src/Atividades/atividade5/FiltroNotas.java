package Atividades.atividade5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class FiltroNotas {

    public static void main(String[] args) {
        // Configura o scanner para aceitar ponto como separador decimal (ex: 8.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1. Criar um ArrayList para armazenar as notas escolares
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Introduza as notas (introduza um valor negativo para terminar):");

        // 2. Laço para ler as notas até que uma nota negativa seja inserida
        while (true) {
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            notas.add(nota);
        }

        // Se nenhuma nota for inserida, encerra o programa para evitar divisão por zero
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi registada.");
            scanner.close();
            return;
        }

        // 3. Calcular e exibir a média aritmética inicial
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.printf(Locale.US, "\nMédia das notas: %.2f\n", media);

        // 4. Remover do ArrayList as notas inferiores a 5.0
        // Nota: Percorremos de trás para a frente para evitar o problema de saltar índices ao remover
        for (int i = notas.size() - 1; i >= 0; i--) {
            if (notas.get(i) < 5.0) {
                notas.remove(i);
            }
        }

        // 5. Exibir a lista final com as notas aprovadas
        System.out.println("Notas aprovadas (>= 5.0): " + notas);

        scanner.close();
    }
}