package Atividades.Atividade8;

public class TransportePublico {
    // Atributos privados (Encapsulamento)
    private String numeroDaLinha;
    private int capacidadePassageiros;
    private double tarifa;

    // Construtor
    public TransportePublico(String numeroDaLinha, int capacidadePassageiros, double tarifa) {
        this.numeroDaLinha = numeroDaLinha;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tarifa = tarifa;
    }

    // Método geral
    public void iniciarViagem() {
        System.out.println("Viagem de transporte público iniciada.");
    }

    // Getters e Setters
    public String getNumeroDaLinha() {
        return numeroDaLinha;
    }

    public void setNumeroDaLinha(String numeroDaLinha) {
        this.numeroDaLinha = numeroDaLinha;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacity) {
        this.capacidadePassageiros = capacity;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
