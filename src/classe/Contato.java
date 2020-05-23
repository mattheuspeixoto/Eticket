package classe;



public class Contato extends Pessoa{
	
	private String assunto;
	private String mensagem;
	private String estado;
	
	
	public Contato(String nome, String email, String pais,String assunto,String mensagem,String estado) {
		super(nome, email, pais);
		this.assunto = assunto;
		this.mensagem = mensagem;
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
		
	                    // toString 
	@Override
	public String toString() {
		return "Contato [assunto=" + assunto + ", mensagem=" + mensagem + "]";
	}
	
	
	                 // HashCode e Equals 
	
    // Equals
public boolean equals(Object o)
{
if ((o instanceof Contato) && ((Contato) o).getAssunto().equals(this.getAssunto())){
	return true;
}else
	return false;
}


    // HashCode

public int hashCode(){
   return getAssunto().length() * 8;
}

	
	
	
	
	
	
	
}
