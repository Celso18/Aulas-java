package Atividades.atividades2;

public class exercicio5 {

    public static void main(String[] args) {

        double valorCompra = 350.00;
        double desconto;

        // Cálculo do desconto
        if (valorCompra < 100.00) {
            desconto = 0;
        }
        else if (valorCompra < 300.00) {
            desconto = valorCompra * 0.10;
        }
        else {
            desconto = valorCompra * 0.20;
        }

        double valorFinal = valorCompra - desconto;

        // Saída formatada
        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
    }
}