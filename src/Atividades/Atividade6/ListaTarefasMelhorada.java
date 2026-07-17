package Atividades.Atividade6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ListaTarefasMelhorada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> tarefasConcluidas = new ArrayList<>(); // Para registrar tarefas concluidas

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarTarefas(scanner, tarefas);
                    break;
                case 2:
                    listarTarefas(tarefas);
                    break;
                case 3:
                    ordenarTarefasAlfabeticamente(tarefas);
                    System.out.println("Tarefas ordenadas alfabeticamente.");
                    break;
                case 4:
                    removerTarefaEspecifica(scanner, tarefas);
                    break;
                case 5:
                    removerPorFIFO(tarefas, tarefasConcluidas);
                    break;
                case 6:
                    removerPorLIFO(tarefas, tarefasConcluidas);
                    break;
                case 7:
                    removerPorFEFO(tarefas, tarefasConcluidas); // Assumindo similar a FIFO se nao houver expiracao
                    break;
                case 8:
                    listarTarefasConcluidas(tarefasConcluidas);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu de Gerenciamento de Tarefas ===");
        System.out.println("1. Adicionar tarefas");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Ordenar tarefas alfabeticamente");
        System.out.println("4. Remover tarefa especifica");
        System.out.println("5. Remover por FIFO (Primeiro a entrar, primeiro a sair)");
        System.out.println("6. Remover por LIFO (Ultimo a entrar, primeiro a sair)");
        System.out.println("7. Remover por FEFO");
        System.out.println("8. Listar tarefas concluidas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarTarefas(Scanner scanner, ArrayList<String> tarefas) {
        System.out.println("Introduza as suas tarefas (digite 'fim' para terminar):");
        while (true) {
            System.out.print("Tarefa: ");
            String entrada = scanner.nextLine().trim();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            if (!entrada.isEmpty()) {
                tarefas.add(entrada);
            }
        }
    }

    private static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa registada.");
            return;
        }
        System.out.println("\nTotal de tarefas: " + tarefas.size());
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    private static void ordenarTarefasAlfabeticamente(ArrayList<String> tarefas) {
        Collections.sort(tarefas);
    }

    private static void removerTarefaEspecifica(Scanner scanner, ArrayList<String> tarefas) {
        listarTarefas(tarefas);
        if (tarefas.isEmpty()) return;

        System.out.print("Digite o número da tarefa a remover: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < tarefas.size()) {
            String removida = tarefas.remove(indice);
            System.out.println("Tarefa removida: " + removida);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void removerPorFIFO(ArrayList<String> tarefas, ArrayList<String> concluidas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        String removida = tarefas.remove(0); // Remove o primeiro (FIFO)
        concluidas.add(removida);
        System.out.println("Tarefa removida por FIFO: " + removida);
    }

    private static void removerPorLIFO(ArrayList<String> tarefas, ArrayList<String> concluidas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        String removida = tarefas.remove(tarefas.size() - 1); // Remove o ultimo (LIFO)
        concluidas.add(removida);
        System.out.println("Tarefa removida por LIFO: " + removida);
    }

    private static void removerPorFEFO(ArrayList<String> tarefas, ArrayList<String> concluidas) {
        // Como nao ha datas de expiracao, implementando similar ao FIFO
        // Em um cenario real, ordenaria por data de expiracao
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        String removida = tarefas.remove(0); // Placeholder para FEFO
        concluidas.add(removida);
        System.out.println("Tarefa removida por FEFO: " + removida + " (implementacao similar a FIFO)");
    }

    private static void listarTarefasConcluidas(ArrayList<String> concluidas) {
        if (concluidas.isEmpty()) {
            System.out.println("Nenhuma tarefa concluida.");
            return;
        }
        System.out.println("\nTarefas Concluidas:");
        for (int i = 0; i < concluidas.size(); i++) {
            System.out.println((i + 1) + ". " + concluidas.get(i));
        }
    }
}