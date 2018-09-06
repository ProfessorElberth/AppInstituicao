package teste;

import negocio.Coordenador;
import negocio.Documentacao;
import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {

	public static void main(String[] args) {
		
		Documentacao docCoordenador = new Documentacao();
		docCoordenador.setCpf("888888888-88");
		docCoordenador.setCtps("9999999-9");
		docCoordenador.setRg("77777777-7");
		docCoordenador.setTituloEleitor("666666666");
		
		Coordenador c = new Coordenador();
		c.setCelular("123456789");
		c.setEmail("coord@coord.com");
		c.setEndereco("Centro - Rio de Janeiro/RJ");
		c.setNome("Carlos");
		c.setDocumentacao(docCoordenador);
		
		Documentacao docGraduacao = new Documentacao();
		docGraduacao.setCpf("888888888-88");
		docGraduacao.setCtps("9999999-9");
		docGraduacao.setRg("77777777-7");
		docGraduacao.setTituloEleitor("666666666");
		
		Graduacao g = null;
		g = new Graduacao("Computação", 480, 1000, true);
		g.setDocumentacao(docCoordenador);
		g.setCoordenador(c);
		g.show();
		
		Especializacao e = null;
		e = new Especializacao("MIT Java", 220, 2000, 2017);
		e.setCoordenador(c);
		e.show();		
	}
}