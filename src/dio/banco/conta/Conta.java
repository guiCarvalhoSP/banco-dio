package dio.banco.conta;

import dio.banco.Banco;
import dio.banco.cliente.Cliente;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private Banco banco;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente, Banco banco) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
	}

	@Override
	public void sacar(double valor) {
		if((valor <= this.saldo && this.saldo > 0)) {
			this.saldo -= valor;
			System.out.println("=== Saque realizado com sucesso");
		} else
			System.out.println("=== Saldo Insuficiente ===");
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("=== Depósito realizado com sucesso ===");
		} else
			System.out.println("=== Valor Inválido, tente novamente!");
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if(valor <= this.saldo && this.saldo > 0){
			this.sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("=== Transferência realizada com sucesso ===");
		} else{
			System.out.println("=== Saldo Insuficiente ===");
		}

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getClienteNome(){
		return cliente.getNome();
	}

	protected void imprimirInfosComuns() {
		System.out.printf("Banco: %s%n", banco.getNome());
		System.out.printf("Titular: %s%n", this.cliente.getNome());
		System.out.printf("Agencia: %d%n", this.agencia);
		System.out.printf("Numero: %d%n", this.numero);
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}
}
