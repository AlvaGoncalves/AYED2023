package ejercicio5;

public class AreaEmpresa {
	private String id;
	private int tardanza;
	
	public AreaEmpresa(String id, int T) {
		this.id = id;
		this.tardanza = T;
	}
	
	public AreaEmpresa() {
		
	}
	
	public int getTardanza() {
		return tardanza;
	}
	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
