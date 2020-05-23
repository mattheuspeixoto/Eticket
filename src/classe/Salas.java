package classe;

public class Salas {
	private String nomesala;
	private String titulo;
	private String hora;
	private String capacidade;
	private String minuto;
	
	
	// Getters and Setters
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public String getNomesala() {
		return nomesala;
	}
	public void setNomesala(String nomesala) {
		this.nomesala = nomesala;
	}
	
	//Construtor
	public Salas(String titulo, String hora, String capacidade, String minuto) {
	    this.titulo = titulo;
		this.hora = hora;
		this.capacidade = capacidade;
		this.minuto = minuto;
	}

	
	// ToString HashCode e Equals
	
	             
	@Override
	public String toString() {
		return "Salas [nomeFilme=" + titulo + ", hora=" + hora
				+ ", capacidade=" + capacidade + ", minuto=" + minuto + "]";
	}

    // Equals
	
public boolean equals(Object o)
{
if ((o instanceof Salas) && ((Salas) o).getNomesala().equals(this.getNomesala())){
	return true;
}else
	return false;
}


    // HashCode

public int hashCode(){
return getNomesala().length() * 8;
}

	
	
}
