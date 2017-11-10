package Bridge;

public class TesteRecibo {
	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("Assert Sistemas", "Marcos Agnoletto", 1400, geradorDeArquivoTXT);
		recibo.geraArquivo();
		System.out.println("Sucesso!");
	}
}
