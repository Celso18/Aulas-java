package Atividades.Atividade4;

import java.util.Scanner;

public class SistemaDeCofreDigital {


    public static void abrirCofre() {

        Scanner scanner = new Scanner(System.in);
        int codigoCorreto = 9999;
        int tentativas = 5;

        System.out.println("=== Cofre Digital ===\n");

        while (tentativas > 0) {
            System.out.print("Digite o código (" + tentativas + " tentativas restantes): ");
            int codigoDigitado = scanner.nextInt();

            if (codigoDigitado == codigoCorreto) {
                System.out.println("Cofre Aberto!");
                scanner.close();
                return; // Sai do método
            }
            else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Código Errado. Restam " + tentativas + " tentativas.");
                }
            }
        }

        System.out.println("Cofre Bloqueado!");
        scanner.close();
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}