package prioridades;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

public class FilaAtendimentoTest {
	
	@Test
	public void adicionaItemLista() {
		FilaAtendimento filaAtendimento = new FilaAtendimento();
		
		Paciente paciente1 = new Paciente("Paciente 1", 28, Prioridade.VERDE);
		Paciente paciente2 = new Paciente("Paciente 2", 28, Prioridade.VERMELHA);
		Paciente paciente3 = new Paciente("Paciente 3", 28, Prioridade.AMARELA);
		Paciente paciente4 = new Paciente("Paciente 4", 28, Prioridade.VERDE);
		Paciente paciente5 = new Paciente("Paciente 5", 28, Prioridade.AMARELA);
		
		List<Paciente> filaForCompare = new ArrayList<>();
		filaForCompare.add(paciente2);
		filaForCompare.add(paciente3);
		filaForCompare.add(paciente5);
		filaForCompare.add(paciente1);
		filaForCompare.add(paciente4);

		List<Paciente> fila = filaAtendimento.addPaciente(paciente1);
		fila = filaAtendimento.addPaciente(paciente2);
		fila = filaAtendimento.addPaciente(paciente3);
		fila = filaAtendimento.addPaciente(paciente4);
		fila = filaAtendimento.addPaciente(paciente5);

		assertEquals(filaForCompare.toString(),fila.toString());
	}

}
