package teste;

import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {

	public static void main(String[] args) {
		Graduacao g = null;
		g = new Graduacao("Computação", 480, 1000, true);
		g.show();
		
		Especializacao e = null;
		e = new Especializacao("MIT Java", 220, 2000, 2017);
		e.show();		
	}
}
