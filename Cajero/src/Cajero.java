
public class Cajero {
	private int dinero; 
	private int papel; 
	private int tipo;
	private String ubicacion;
	private int ID;
	
	public Cajero(int dinero, int papel, int tipo, String ubicacion, int iD) {
		super();
		this.dinero = dinero;
		this.papel = papel;
		this.tipo = tipo;
		this.ubicacion = ubicacion;
		ID = iD;
	}
	
	

	public int getDinero() {
		return dinero;
	}



	public void setDinero(int dinero) {
		this.dinero = dinero;
	}



	public int getPapel() {
		return papel;
	}



	public void setPapel(int papel) {
		this.papel = papel;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	@Override
	public String toString() {
		return "Cajero [dinero=" + dinero + ", papel=" + papel + ", tipo=" + tipo + ", ubicacion=" + ubicacion + ", ID="
				+ ID + "]";
	}
	
	
}
