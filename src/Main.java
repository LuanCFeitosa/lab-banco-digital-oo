import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco bradesco = new Banco("Bradesco");
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		
		poupanca.imprimirExtrato();

		bradesco.adicionarConta(poupanca);

		bradesco.adicionarConta(cc);

		bradesco.listarContas();
	}

}
