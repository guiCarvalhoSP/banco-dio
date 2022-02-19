package dio.banco.conta;

import dio.banco.Banco;
import dio.banco.cliente.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {

		super(cliente, banco);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
