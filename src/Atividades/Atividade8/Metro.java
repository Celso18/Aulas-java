package Atividades.Atividade8;

public class Metro extends TransportePublico {
    // Atributo exclusivo
    private int quantidadeVagoes;

    // Construtor chamando a classe mãe (super)
    public Metro(String numeroDaLinha, int capacidadePassageiros, double tarifa, int quantidadeVagoes) {
        super(numeroDaLinha, capacidadePassageiros, tarifa);
        this.quantidadeVagoes = quantidadeVagoes;
    }

    // Sobrescrita do método (Polimorfismo)
    @Override
    public void iniciarViagem() {
        System.out.println("Metrô saindo da Estação Central de Brasília.");
    }

    // Método exclusivo
    public void acionarAlertaSonoro() {
        System.out.println("Aviso: Próxima estação, Galeria.");
    }

    // Getter e Setter exclusivo
    public int getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(int quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }
}
