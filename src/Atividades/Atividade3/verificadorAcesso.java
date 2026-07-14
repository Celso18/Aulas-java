package Atividades.Atividade3;

import java.util.Scanner;

public class verificadorAcesso {


    public static boolean verificarMaioridade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        boolean maiorDeIdade = verificarMaioridade(idade);

        if (maiorDeIdade) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }

        scanner.close();
    }
}