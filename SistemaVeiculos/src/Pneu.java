
public class Pneu {
	private String marca;
	private int aro;
	
	public Pneu(String marca, int aro) {
		super();
		this.marca = marca;
		this.aro = aro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	@Override
	public String toString() {
		return "Pneu [marca=" + marca + ", aro=" + aro + "]";
	}
	
}
