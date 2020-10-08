import interfaces.CriarPerguntas;
import model.TbPergunta;

public class AguaDomicilioPerguntaImpl implements CriarPerguntas {

  @Override
  public TbPergunta criar() {
    TbPergunta pergunta = new TbPergunta();
    pergunta.setNome("Agua domicilio");
    return pergunta;
  }
}
