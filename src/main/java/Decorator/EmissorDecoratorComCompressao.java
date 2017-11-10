package Decorator;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {

	public EmissorDecoratorComCompressao(Emissor emissor) {
		super(emissor);
	}

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem comprimida: ");
		String mensagemComprimida;
		try {
			mensagemComprimida = comprime(mensagem);
		} catch (Exception e) {
			mensagemComprimida = mensagem;
		}
		this.getEmissor().envia(mensagemComprimida);
	}
	
	private String comprime(String mensagem) throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
		dout.write(mensagem.getBytes());
		dout.close();
		return new String(out.toByteArray());
	}
	
	
}
