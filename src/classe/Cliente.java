package classe;

public class Cliente extends Pessoa{
	private String CPF;
	private String endereco;
	private String dataNascimento;
	private String numeroEndereco;
	private String CEP;
	private String estado;
	private String cidade;
	private String bairro;
	
	//Construtor

	public Cliente(String nome, String email, String pais, String CPF, String endereco, String dataNascimento,
			String numeroEndereco, String CEP, String estado, String cidade, String bairro) {
		super(nome, email, pais);
		this.CPF = CPF;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.numeroEndereco = numeroEndereco;
		this.CEP = CEP;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
	}

	// Getters and Setters 
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	       // toString 
	
	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", endereco=" + endereco
				+ ", dataNascimento=" + dataNascimento + ", numeroEndereco="
				+ numeroEndereco + ", CEP=" + CEP + ", estado=" + estado
				+ ", cidade=" + cidade + ", bairro=" + bairro + "]";
	}

             // Equals
	public boolean equals(Object o)
	{
		if ((o instanceof Cliente) && ((Cliente) o).getNome().equals(this.getNome())){
			return true;
	    }else
			return false;
	}
	
	
	        // HashCode
	
	public int hashCode(){
		return getNome().length() * 8;
	}
	
	
}
