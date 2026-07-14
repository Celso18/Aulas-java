package Atividades.Atividade4;

public class ConstrutorDeEscadas {


    public static void desenharEscada(int degraus, char simbolo) {

        System.out.println("=== Escada com " + degraus + " degraus ===\n");


        for (int linha = 1; linha <= degraus; linha++) {


            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {


        desenharEscada(4, '#');

        System.out.println(); // Linha em branco

        desenharEscada(4, '#');
    }
}