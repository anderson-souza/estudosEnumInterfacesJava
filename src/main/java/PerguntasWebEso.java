import interfaces.CriarPerguntas;
import interfaces.IntegrarPerguntas;

public enum PerguntasWebEso implements IntegrarPerguntas {

  TIPOAGUA("69", "tipoAgua") {
    @Override
    public CriarPerguntas criarpergunta() {
      return new AguaDomicilioPerguntaImpl();
    }
  },
  TIPOELETRICIDADE("35", "tipoEletricidade") {
    @Override
    public CriarPerguntas criarpergunta() {
      return new EletricidadePerguntaImpl();
    }
  };
  private final String codigo;
  private final String nome;

  PerguntasWebEso(String codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "PerguntasWebEso{" +
        "codigo='" + codigo + '\'' +
        ", nome='" + nome + '\'' +
        '}';
  }
}
