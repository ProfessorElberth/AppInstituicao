package negocio;

public class Coordenador {

	private String nome;
	private String email;
	private String celular;
	private String endereco;
	private Documentacao documentacao;
	
	public void show() {
		System.out.printf("\n#coordenador\n");
		
		System.out.printf(
				  "Nome: %s\n"
				+ "E-mail: %s\n"
				+ "Celular: %s\n"
				+ "Endereço: %s\n",
				nome,
				email,
				celular,
				endereco
			);
		
		documentacao.show();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Documentacao getDocumentacao() {
		return documentacao;
	}
	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}
}