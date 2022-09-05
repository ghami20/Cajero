
public class Tarjeta {

	private String nro_tarjeta; 
	private String fecha_vencimiento;
	
	public Tarjeta(String nro_tarjeta, String fecha_vencimiento) {
		super();
		this.nro_tarjeta = nro_tarjeta;
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getNro_tarjeta() {
		return nro_tarjeta;
	}



	public void setNro_tarjeta(String nro_tarjeta) {
		this.nro_tarjeta = nro_tarjeta;
	}



	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}



	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}



	@Override
	public String toString() {
		return "Tarjeta [nro_tarjeta=" + nro_tarjeta + ", fecha_vencimiento=" + fecha_vencimiento + "]";
	}
	
	
}
