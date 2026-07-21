package Aulas.encapsulamento.banco.principal;

import Aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Linha 14 corrigida: Passando apenas o nome
        ContaBancaria minhaConta = new ContaBancaria("Celso");

        // Remova a linha "minhaConta.setTitular(...)" pois ela causará erro agora (Regra 2)

        System.out.println(minhaConta.getTitular());
        System.out.println("Número da conta: " + minhaConta.getNumeroDaConta());

        // Linhas 21 e 22: Agora vão funcionar perfeitamente sem erro!
        ContaBancaria pessoal = new ContaBancaria("Fulano");
        ContaBancaria pessoal2 = new ContaBancaria("Robso");

        System.out.println("Conta pessoal 1: " + pessoal.getNumeroDaConta());
        System.out.println("Conta pessoal 2: " + pessoal2.getNumeroDaConta());
    }
}
