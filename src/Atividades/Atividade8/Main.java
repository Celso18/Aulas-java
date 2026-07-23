package Atividades.Atividade8;

public class Main {
    public static void main(String[] args) {
        // Instanciando o Ônibus (Ex: Linha 110 - Piracicabana, Tarifa R$ 5,50)
        Onibus busao = new Onibus("110", 80, 5.50, "Piracicabana");

        // Instanciando o Metrô (Ex: Linha Laranja, Tarifa R$ 5,50)
        Metro trem = new Metro("Laranja", 600, 5.50, 4);

        // Chamadas dos métodos com saídas esperadas
        busao.iniciarViagem();
        trem.iniciarViagem();
    }
}
