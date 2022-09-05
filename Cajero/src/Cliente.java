
public class Cliente extends Persona {

	private int nro_cliente;
	private String tipo_cliente;
	
	public Cliente(String nombre, String apellido, String documento, int nro_cliente, String tipo_cliente) {
		super(nombre, apellido, documento);
		this.nro_cliente = nro_cliente;
		this.tipo_cliente = tipo_cliente;
	}

	public int getNro_cliente() {
		return nro_cliente;
	}

	public void setNro_cliente(int nro_cliente) {
		this.nro_cliente = nro_cliente;
	}

	public String getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

	@Override
	public String toString() {
		return "Cliente [nro_cliente=" + nro_cliente + ", tipo_cliente=" + tipo_cliente + "]";
	}
	
	
	
	
}
