
public class Empleado extends Persona {
	
	private int nro_empleado;
	private String sector;
	
	public Empleado(String nombre, String apellido, String documento, int nro_empleado, String sector) {
		super(nombre, apellido, documento);
		this.nro_empleado = nro_empleado;
		this.sector = sector;
	}

	public int getNro_empleado() {
		return nro_empleado;
	}

	public void setNro_empleado(int nro_empleado) {
		this.nro_empleado = nro_empleado;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Empleado [nro_empleado=" + nro_empleado + ", sector=" + sector + "]";
	}

}
