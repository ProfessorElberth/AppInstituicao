package negocio;

public class Contato {
	private String email;
	private String celular;
	private String endereco;
	
	public void show() {
		System.out.printf("\n#contato\n");
		
		System.out.printf(
				  "E-mail: %s\n"
				+ "Celular: %s\n"
				+ "Endereço: %s\n",
				email,
				celular,
				endereco
			);
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
}
