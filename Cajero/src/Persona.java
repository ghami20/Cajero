
public class Persona {
	
	private String nombre; 
	private String apellido; 
	private String documento;
	
	public Persona(String nombre, String apellido, String documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + "]";
	}
	
	public boolean Ingreso(int pin, int tarjeta) {
		System.out.println("ingreso exitoso");
		return true; 
	}
}
