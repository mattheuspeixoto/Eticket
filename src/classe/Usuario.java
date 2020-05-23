package classe;

public class Usuario {

	private String nome;
	private String senha;
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", senha=" + senha + "]";
	}

	public boolean equals(Object o)
	{
	if ((o instanceof Usuario) && ((Usuario) o).getNome().equals(this.getNome())){
		return true;
	}else
		return false;
	}


	    // HashCode

	public int hashCode(){
	return getNome().length() * 8;
	}

	
	
}
