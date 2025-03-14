import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public Banco(String nome){
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public void adicionarConta(Conta conta){
		contas.add(conta);
	}

	public void listarContas(){
		for(Conta conta: contas){
			System.out.println("Cliente: " + conta.cliente.getNome() + "Agencia: " + conta.getAgencia() + " | Conta: " + conta.getNumero());
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
