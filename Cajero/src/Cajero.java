
public class Cajero {
	private int dinero; 
	private int papel; 
	private int tipo;
	private String ubicacion;
	private int ID;
	private boolean habilitado;
	
	public Cajero(int dinero, int papel, int tipo, String ubicacion, int iD) {
		super();
		this.dinero = dinero;
		this.papel = papel;
		this.tipo = tipo;
		this.ubicacion = ubicacion;
		ID = iD;
		habilitado=true;
	}
	
	

	public boolean getHabilitado() {
		return habilitado;
	}



	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
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
	
	public boolean IngresarDinero(int dinero) {
		
		if(dinero>0) {
			int aux;
			aux = this.getDinero() + dinero;
			this.setDinero(aux);
			return true;
		}else {
			return false;
		}
	}
	public boolean verEstado() {
		
	 System.out.println(" El cajero tiene " + this.getDinero() + "$");
	 if(this.getHabilitado()) {
		 System.out.println(" El cajero esta habilitado");
	 }else {
		 System.out.println("El cajero no esta habilitado");
	 }
		return true; 
	}
	
	
	
}
