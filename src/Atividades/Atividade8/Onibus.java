package Atividades.Atividade8;

public class Onibus extends TransportePublico {
    // Atributo exclusivo
    private String nomeViacao;

    // Construtor chamando a classe mãe (super)
    public Onibus(String numeroDaLinha, int capacidadePassageiros, double tarifa, String nomeViacao) {
        super(numeroDaLinha, capacidadePassageiros, tarifa);
        this.nomeViacao = nomeViacao;
    }

    // Sobrescrita do método (Polimorfismo)
    @Override
    public void iniciarViagem() {
        System.out.println("Ônibus da viação " + this.nomeViacao + " saindo da Rodoviária do Plano.");
    }

    // Método exclusivo
    public void abrirPortasTraseiras() {
        System.out.println("Portas traseiras do ônibus abertas para desembarque.");
    }

    // Getter e Setter exclusivo
    public String getNomeViacao() {
        return nomeViacao;
    }

    public void setNomeViacao(String nomeViacao) {
        this.nomeViacao = nomeViacao;
    }
}
