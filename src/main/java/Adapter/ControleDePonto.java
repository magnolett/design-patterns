package Adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Objetivo: Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa,possui uma interface diferente.

public class ControleDePonto {
	public void registraEntrada(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Entrada: " + f.getNome() + " às " + format);
	}

	public void registraSaida(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Saída: " + f.getNome() + " às " + format);
	}
}
