package Decorator;

public abstract class EmissorDecorator implements Emissor {
	public Emissor emissor;
	
	public EmissorDecorator(Emissor emissor) {
		this.emissor = emissor;
	}
	
	public abstract void envia(String mensagem);

	public Emissor getEmissor() {
		return this.emissor;
	}
}
