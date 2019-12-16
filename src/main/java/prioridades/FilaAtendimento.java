package prioridades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class FilaAtendimento {
	
	private List<Paciente> filaDeAtendimento;

	public FilaAtendimento() {
		filaDeAtendimento = new ArrayList<>();
	}
	public List<Paciente> addPaciente(Paciente paciente){
		filaDeAtendimento.add(paciente);
		filaDeAtendimento.sort(Comparator.comparing(Paciente :: getPrioridade));	
		return filaDeAtendimento;
	}
	
}
