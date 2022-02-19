package dio.banco;

import java.util.List;
import java.util.ArrayList;

import dio.banco.cliente.Cliente;
import dio.banco.cliente.endereco.Endereco;
import dio.banco.conta.Conta;
import dio.banco.conta.ContaCorrente;
import dio.banco.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Exemplo", "xxx.xxx-xx");

        Cliente guilherme = new Cliente(
                "Guilherme",
                20,
                new Endereco(
                        "Av.exemplo",
                        100,
                        "Sao Paulo",
                        "SP",
                        null ));

        Conta cc = new ContaCorrente(guilherme, banco);
        Conta poupanca = new ContaPoupanca(guilherme, banco);

        List<Conta> contas;
        contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(poupanca);

        banco.setContas(contas);
        cc.depositar(90);
        cc.transferir(100, poupanca);
        banco.obterContas();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
