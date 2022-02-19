package dio.banco.cliente;

import dio.banco.cliente.endereco.Endereco;

public class Cliente {

	private final  String nome;
	private int idade;
	private Endereco endereco;

	public Cliente(String nome, int idade, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}


}
