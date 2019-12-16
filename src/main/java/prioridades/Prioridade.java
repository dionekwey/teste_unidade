package prioridades;

public enum Prioridade {
	VERMELHA(3), 
	AMARELA(2), 
	VERDE(1);

	private int valorPrioridae;

	Prioridade(int valorPrioridae) {
		this.valorPrioridae = valorPrioridae;
	}

	public int getValorPrioridade() {
		return valorPrioridae;
	}

}
