package objetos;

public class Cliente {

	public String nome;
	public int anoNascimento; 
	public char sexo; 
	public boolean fidelidade;

	
	
	public String getNome() {
		return nome;
	}

	public boolean isFidelidade() {
		return fidelidade;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public void informarNome(String nomeCliente ) {
		nome=nomeCliente;
	}
	public void informarAnoNascimento() {
		System.out.print(2021-anoNascimento);
		if ((2021-anoNascimento)>=18) {
			System.out.println(" anos e pertence ao Publico Adulto.");
		}else {
			System.out.println(" anos e pertence ao Publico infantil.");
		}
	}
	public void informarSexo() {
		System.out.println("Digite qual o sexo que se identifica F/M/O");

	}
	public void informarFidelidade(char fidelidade) {
		if (fidelidade == 's') {
			this.fidelidade=true;
		}else {
			this.fidelidade=false;
		}

	}


}