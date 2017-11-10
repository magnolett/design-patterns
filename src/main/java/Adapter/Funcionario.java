package Adapter;

//Objetivo: Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa,possui uma interface diferente.

public class Funcionario {
	private String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
