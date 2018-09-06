package negocio;

public class Documentacao {

	private String cpf;
	private String rg;
	private String tituloEleitor;
	private String ctps;
	
	public void show() {
		System.out.println("#documentacao");

		System.out.printf(
				  "CPF: %s\n"
				+ "RG: %s\n"
				+ "Título de eleitor: %s\n"
				+ "CTPS: %s\n",
				cpf,
				rg,
				tituloEleitor,
				ctps
			);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
}