package prioridades;

public class Paciente {

	private String nome;
	private Integer idade;
	private Prioridade prioridade;

	public Paciente() {
	}

	public Paciente(String nome, Integer idade, Prioridade prioridade) {
		this.nome = nome;
		this.idade = idade;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

}
