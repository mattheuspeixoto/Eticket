package classe;

public class VendShow {
	
	private String atracao;
	private String area;
	
			
	public String getatracao() {
		return atracao;
	}
	public void setatracao(String atracao) {
		this.atracao = atracao;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public VendShow(String atracao, String area) {
		this.atracao = atracao;
		this.area = area;
		} 
	
	
	// toString 
	@Override
	public String toString() {
		return "VendShow [atracao=" + atracao + ", area=" + area + "]";
	}
	
	
	public boolean equals(Object o)
	{
	if ((o instanceof VendShow) && ((VendShow) o).getatracao().equals(this.getatracao())){
		return true;
	}else
		return false;
	}


	    // HashCode

	public int hashCode(){
	return getatracao().length() * 8;
	}

	
	
	
}
