package Atividades.Atividade9;

import java.util.ArrayList;

public class Cadastro {
    private String nome;
    private int idade;
    private String cargo;
    private boolean ativo;

    // Lista estática centralizada para armazenar cadastros incompletos
    public static ArrayList<Cadastro> dadosIncompletos = new ArrayList<>();

    // Construtor 1: Cadastro Completo
    public Cadastro(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = true; // Dados completos, cadastro ativo
    }

    // Construtor 2: Falta o Cargo
    public Cadastro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = null; // Incompleto
        this.ativo = false;
        dadosIncompletos.add(this); // Adiciona automaticamente à lista
    }

    // Construtor 3: Falta Idade e Cargo
    public Cadastro(String nome) {
        this.nome = nome;
        this.idade = -1; // Valor sentinela para indicar ausência de dado
        this.cargo = null; // Incompleto
        this.ativo = false;
        dadosIncompletos.add(this); // Adiciona automaticamente à lista
    }

    // Método para atualizar os dados restantes
    public void completarCadastro(int idade, String cargo) {
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = true; // Ativa o cadastro após preenchimento
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getCargo() { return cargo; }
    public boolean isAtivo() { return ativo; }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + (idade == -1 ? "N/A" : idade) +
                " | Cargo: " + (cargo == null ? "N/A" : cargo) + " | Ativo: " + ativo;
    }
}
