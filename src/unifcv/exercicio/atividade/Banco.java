package unifcv.exercicio.atividade;

public class Banco {
	
	private String conta;
	private String nome;
	
	public Banco(String conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;		
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	 public String toString(){
		 return "Conta [conta =" + conta +" , nome= " + nome +"]";
	 }

	@Override
	public int hashCode() {
		return this.conta.length();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

		
	

}
