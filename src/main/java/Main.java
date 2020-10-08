import java.lang.reflect.Field;
import model.TbPergunta;
import model.domicilio.Domicilio;
import org.apache.commons.lang3.EnumUtils;

public class Main {

  public static void main(String[] args) {

    Domicilio domicilio = new Domicilio();
    for (Field declaredField : domicilio.getClass().getDeclaredFields()) {

      if (EnumUtils.isValidEnumIgnoreCase(PerguntasWebEso.class, declaredField.getName())) {
        TbPergunta pergunta = PerguntasWebEso.valueOf(declaredField.getName().toUpperCase())
            .criarpergunta().criar();
        System.out.println(pergunta);
      }
    }
  }
}
