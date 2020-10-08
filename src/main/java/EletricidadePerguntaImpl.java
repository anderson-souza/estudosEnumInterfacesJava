import interfaces.CriarPerguntas;
import model.TbPergunta;

public class EletricidadePerguntaImpl implements CriarPerguntas {

  @Override
  public TbPergunta criar() {
    TbPergunta tbPergunta = new TbPergunta();
    tbPergunta.setNome("Eletricidade");
    return tbPergunta;
  }
}
