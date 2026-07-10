package Aulas;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Qual sua altura? ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Qual seu cargo? ");
        String cargo = scanner.nextLine();

        System.out.print("Qual o período que estuda no SENAI? (Ex: Noite): ");
        String periodoSenai = scanner.nextLine();


        System.out.println(
                "\n=== FORMULÁRIO DE REGISTRO ===\n" +
                        "Nome Completo: " + nomeCompleto + "\n" +
                        "Idade: " + idade + " anos\n" +
                        "Altura: " + altura + "m\n" +
                        "Cargo: " + cargo + "\n" +
                        "Período no SENAI: " + periodoSenai
        );

        scanner.close();
    }
}








