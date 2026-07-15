package Atividades.Atividade3;

import java.util.Scanner;

public class sistemaDeMonitoramento {

    // Método com retorno de valor decimal (double)
    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    // Método void que avalia o clima com base na temperatura em Fahrenheit
    public static void avaliarClima(double fahrenheit) {
        if (fahrenheit < 50.0) {
            System.out.println("Clima Frio.");
        } else if (fahrenheit < 80.0) {
            System.out.println("Clima Agradável.");
        } else {
            System.out.println("Clima Quente.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // O main chama o método de conversão e usa o resultado para chamar avaliarClima
        double fahrenheit = converterParaFahrenheit(celsius);
        avaliarClima(fahrenheit);

        scanner.close();
    }
}
