
public class Carro {
	private String marca, modelo;
	private int anoFabricacao, anoModelo;
	private Pneu pneu1, pneu2, pneu3, pneu4, estepe;
	

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", anoModelo="
				+ anoModelo + ", pneu1=" + pneu1 + ", pneu2=" + pneu2 + ", pneu3=" + pneu3 + ", pneu4=" + pneu4
				+ ", estepe=" + estepe + "]";
	}
	public Carro(String marca, String modelo, int anoFabricacao, int anoModelo, Pneu pneu1, Pneu pneu2, Pneu pneu3,
			Pneu pneu4, Pneu estepe) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.pneu1 = pneu1;
		this.pneu2 = pneu2;
		this.pneu3 = pneu3;
		this.pneu4 = pneu4;
		this.estepe = estepe;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	
}
