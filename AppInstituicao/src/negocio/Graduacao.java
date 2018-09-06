package negocio;

public class Graduacao extends Curso {
	private boolean tecnologo;
	private Documentacao documentacao;
	
	public Graduacao(String nome, int cargaHoraria, float valor, boolean tecnologo) {
		super(nome, cargaHoraria, valor);
		this.tecnologo = tecnologo;
	}

	public void show() {
		System.out.printf("\n#graduacao\n");
		
		super.show();
		
		System.out.printf(
				"Tecnólogo: %s\n\n",
			  tecnologo ? "sim" : "não"
			);
		
		documentacao.show();
	}

	public boolean isTecnologo() {
		return tecnologo;
	}
	public void setTecnologo(boolean tecnologo) {
		this.tecnologo = tecnologo;
	}
	public Documentacao getDocumentacao() {
		return documentacao;
	}
	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}
}