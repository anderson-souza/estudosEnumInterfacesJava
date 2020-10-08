package model.domicilio;

public class Domicilio {

  private TipoAgua tipoAgua;
  private TipoEletricidade tipoEletricidade;
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TipoAgua getTipoAgua() {
    return tipoAgua;
  }

  public void setTipoAgua(TipoAgua tipoAgua) {
    this.tipoAgua = tipoAgua;
  }

  public TipoEletricidade getTipoEletricidade() {
    return tipoEletricidade;
  }

  public void setTipoEletricidade(TipoEletricidade tipoEletricidade) {
    this.tipoEletricidade = tipoEletricidade;
  }
}
