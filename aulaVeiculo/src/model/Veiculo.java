package model;

public class Veiculo {

	private String marca;
	private String modelo;
	
	public Veiculo(String pmarca, String pmodelo){
		this.marca = pmarca;
		this.modelo = pmodelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String pmarca) {
		this.marca = pmarca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String pmodelo) {
		this.modelo = pmodelo;
	}
	
	public String dadosFormatados() {
		return String.format("Marca: %s\nModelo: %s\n", this.marca, this.modelo);
	}
	
}
