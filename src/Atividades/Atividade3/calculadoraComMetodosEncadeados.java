package Atividades.Atividade3;

import java.util.Scanner;

public class calculadoraComMetodosEncadeados {

    // Método com retorno de valor numérico
    public static int subtrairNumeros(int x, int y) {
        return x - y;
    }

    // Método void que apenas imprime o resultado
    public static void imprimirResultado(int valor) {
        System.out.println("O resultado da operação é: " + valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número (y): ");
        int y = scanner.nextInt();

        // O main chama o método de subtração e passa o resultado diretamente
        // para o método de impressão, sem fazer cálculos ou imprimir diretamente
        imprimirResultado(subtrairNumeros(x, y));

        scanner.close();
    }
}