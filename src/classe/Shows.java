package classe;

public class Shows {
	
	private String atracao;
	private String local;
	private String hora;
	private String minuto;
	private String classificacao;
	private String data;
		
	// Construtor
	
	public Shows(String atracao, String local, String hora, String minuto,String classificacao,String data) {
		this.atracao = atracao;
		this.local = local;
		this.hora = hora;
		this.minuto = minuto;
		this.classificacao = classificacao;
		this.data = data;
	}
	
	// Getters and Setters

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getAtracao() {
		return atracao;
	}
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
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
	
	// toString
	@Override
	public String toString() {
		return "Shows [atracao=" + atracao + ", local=" + local + ", hora="
				+ hora + ", minuto=" + minuto + ", classificacao="
				+ classificacao + "]";
	}
	
	
	public boolean equals(Object o)
	{
	if ((o instanceof Shows) && ((Shows) o).getAtracao().equals(this.getAtracao())){
		return true;
	}else
		return false;
	}


	    // HashCode

	public int hashCode(){
	return getAtracao().length() * 8;
	}

		
	
}
