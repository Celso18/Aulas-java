package Atividades.Atividade3;

import java.util.Scanner;

public class saudacaoPersonalizada {

    // Método sem retorno (void)
    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo à nossa aula de métodos.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Chamada do método
        imprimirSaudacao(nome);

        scanner.close();
    }
}