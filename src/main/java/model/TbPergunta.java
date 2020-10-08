package model;

public class TbPergunta {

  private String nome;
  private PerguntaDetalhe perguntaDetalhe;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public PerguntaDetalhe getPerguntaDetalhe() {
    return perguntaDetalhe;
  }

  public void setPerguntaDetalhe(PerguntaDetalhe perguntaDetalhe) {
    this.perguntaDetalhe = perguntaDetalhe;
  }

  @Override
  public String toString() {
    return "TbPergunta{" +
        "nome='" + nome + '\'' +
        ", perguntaDetalhe=" + perguntaDetalhe +
        '}';
  }
}
