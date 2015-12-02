import static org.junit.Assert.*;
import org.junit.Test;

public class DadoTest {

	@Test
	public void testGenerar_numero() {
		int aleatoriedad = -1;
		for (int i = 0; i <=99999; i++){
			aleatoriedad = Dado.generar_numero();
			assertTrue ("Rango incorrecto",(aleatoriedad >=0) && (aleatoriedad < Dado.ALUMNOS ));
		}
	}

}
