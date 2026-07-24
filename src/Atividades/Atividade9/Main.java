package Atividades.Atividade9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Criando cadastros (completos e incompletos)
        Cadastro c1 = new Cadastro("Ana", 28, "Gerente");
        Cadastro c2 = new Cadastro("Bruno", 22); // Sem cargo
        Cadastro c3 = new Cadastro("Carlos");     // Sem idade e sem cargo

        System.out.println("--- Lista de Incompletos Inicial ---");
        exibirListaIncompletos();

        // 2. Fluxo de Atualização de Dados
        System.out.println("\n--- Atualizando Cadastros ---");

        // Vamos atualizar o Bruno (está no índice 0 da lista de incompletos)
        if (!Cadastro.dadosIncompletos.isEmpty()) {
            Cadastro bruno = Cadastro.dadosIncompletos.get(0);
            System.out.println("Completando dados de: " + bruno.getNome());

            // O construtor do Bruno já tinha idade (22), passamos a idade existente e o novo cargo
            bruno.completarCadastro(bruno.getIdade(), "Analista");

            // Remove da lista de incompletos pois agora está ativo
            Cadastro.dadosIncompletos.remove(bruno);
        }

        // Vamos atualizar o Carlos (que virou o novo índice 0 após a remoção do Bruno)
        if (!Cadastro.dadosIncompletos.isEmpty()) {
            Cadastro carlos = Cadastro.dadosIncompletos.get(0);
            System.out.println("Completando dados de: " + carlos.getNome());

            // Carlos não tinha nada, passamos os dois dados novos
            carlos.completarCadastro(35, "Designer");

            // Remove da lista de incompletos
            Cadastro.dadosIncompletos.remove(carlos);
        }

        System.out.println("\n--- Lista de Incompletos Final ---");
        exibirListaIncompletos();

        System.out.println("\n--- Estado Final dos Objetos ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    // Método auxiliar para printar a lista de pendências
    public static void exibirListaIncompletos() {
        if (Cadastro.dadosIncompletos.isEmpty()) {
            System.out.println("Nenhum cadastro incompleto!");
        } else {
            for (Cadastro c : Cadastro.dadosIncompletos) {
                System.out.println(c);
            }
        }
    }
}
