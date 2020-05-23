package classe;

public class VendCine {
	private String sala;
	private String exibicao;
	private String cadeira;
	private String horario;
	
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getExibicao() {
		return exibicao;
	}
	public void setExibicao(String exibicao) {
		this.exibicao = exibicao;
	}
	public String getCadeira() {
		return cadeira;
	}
	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public VendCine(String sala, String exibicao, String cadeira, String horario) {
		this.sala = sala;
		this.exibicao = exibicao;
		this.cadeira = cadeira;
		this.horario = horario;
		
		
		//toString 
	}
	@Override
	public String toString() {
		return "VendCine [sala=" + sala + ", exibicao=" + exibicao
				+ ", cadeira=" + cadeira + ", horario=" + horario + "]";
	}
	

	public boolean equals(Object o)
	{
	if ((o instanceof VendCine) && ((VendCine) o).getSala().equals(this.getSala())){
		return true;
	}else
		return false;
	}


	    // HashCode

	public int hashCode(){
	return getSala().length() * 8;
	}

	
	
}
