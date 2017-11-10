package Adapter;

public class TesteControleDePonto {
	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Marcos Agnoletto");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}
	
}
