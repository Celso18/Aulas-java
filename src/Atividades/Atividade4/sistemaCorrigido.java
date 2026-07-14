package Atividades.Atividade4;

public class sistemaCorrigido {

public static void main(String[] args) {

    int valor = 10;           // Corrigido: nome de variável não pode começar com número
    int contador = 5;         // Corrigido: foi incluso o ponto e virgula após o número 5.

    exibirMensagem("Bem-vindo ao sistema");

    while (contador > 0) {
        System.out.println("Iniciando em: " + contador);
        contador--;   // a correção evita o loop infinito
    }
}

public static void exibirMensagem(String texto) {
    System.out.println(texto);    // Método corrigido
}
}