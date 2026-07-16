package Atividades.atividade5;

import java.util.Scanner;
import java.util.ArrayList;

public class ListaTarefasDinamica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Instanciar um ArrayList para guardar as tarefas
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("Introduza as suas tarefas (digite 'fim' para terminar):");

        // 2. Utilizar um laço while para pedir as tarefas
        while (true) {
            System.out.print("Tarefa: ");
            String entrada = scanner.nextLine().trim();

            // 3. Parar o programa se o utilizador digitar "fim" (ignore case)
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            // 4. Adicionar a tarefa ao ArrayList se não for vazia
            if (!entrada.isEmpty()) {
                tarefas.add(entrada);
            }
        }

        // 5. Exibir a quantidade total e listar uma a uma
        System.out.println("\nTotal de tarefas registadas: " + tarefas.size());
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        scanner.close();
    }
}