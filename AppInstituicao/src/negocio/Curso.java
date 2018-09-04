package negocio;

public class Curso {
	
	private String nome;
	private int cargaHoraria;
	private float valor;
	
	public Curso(String nome, int cargaHoraria, float valor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public void show() {
		System.out.printf(
				"Nome: %s\n"
			  + "Carga horária: %d\n"
			  + "Valor: %.2f\n\n",
			  nome,
			  cargaHoraria,
			  valor
			);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
