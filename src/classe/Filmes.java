package classe;

public class Filmes{
	private String titulo;
	private String genero;
	private String hora;
	private String minuto;
	private String classificacao;
	private Pessoa diretor;
	private Pessoa ator;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getMinuto() {
		return minuto;
	}
	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Pessoa getAtor() {
		return ator;
	}
	public void setAtor(Pessoa ator) {
		this.ator = ator;
	}
	public Pessoa getDiretor() {
		return diretor;
	}
	public void setDiretor(Pessoa diretor) {
		this.diretor = diretor;
	}
	
	// Construtor	
	public Filmes(String titulo, String genero, String hora, String minuto,String classificacao, Pessoa diretor, Pessoa ator) {
		this.titulo = titulo;
		this.genero = genero;
		this.hora = hora;
		this.minuto = minuto;
		this.classificacao = classificacao;
		this.diretor = diretor;
		this.ator = ator;
	}
	
	
	
    // Equals
public boolean equals(Object o)
{
if ((o instanceof Filmes) && ((Filmes) o).getTitulo().equals(this.getTitulo())){
	return true;
}else
	return false;
}


    // HashCode

public int hashCode(){
return getTitulo().length() * 8;
}

	
	@Override
	public String toString() {
		return "Filmes [titulo=" + titulo + ", genero=" + genero + ", hora="
				+ hora + ", minuto=" + minuto + ", classificacao="
				+ classificacao + ", diretor=" + diretor + ", ator=" + ator
				+ "]";
	}
	
	
}
