package Aulas.objeto;

import java.sql.SQLOutput;

public class SextaAula {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(
                "João",
                2004,
                'M',
                "Branco",
                "Professor"
        );

        System.out.println(pessoa1.getNome());

        System.out.println(pessoa1);

        pessoa1.setNome("Fulano de tal");

        System.out.println(pessoa1);
    }
}

