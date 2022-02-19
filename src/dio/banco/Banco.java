package dio.banco;

import dio.banco.conta.Conta;
import java.util.List;

public class Banco {

	private final String nome;
	private String cnpj;

	public Banco(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void obterContas(){
		System.out.println("Lista de contas:");
		for (Conta conta: contas) {
			System.out.println("Conta: " + conta.getNumero());
			System.out.println("Agência: " + conta.getAgencia());
			System.out.println("Cliente: " + conta.getClienteNome());
			System.out.println();
		}
	}

}
