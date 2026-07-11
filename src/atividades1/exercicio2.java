package atividades1;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é a sua nota ?");

        double nota = entrada.nextInt();

        if (nota <= 7) {
            System.out.println("Aprovado");
