
public class Cuenta {
	
	private int pin; 
	private int nro_cuenta;
	private boolean habilitado;
	private double saldo;
	
	public Cuenta(int pin, int nro_cuenta, boolean habilitado, double saldo) {
		super();
		this.pin = pin;
		this.nro_cuenta = nro_cuenta;
		this.habilitado = habilitado;
		this.saldo = saldo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getNro_cuenta() {
		return nro_cuenta;
	}

	public void setNro_cuenta(int nro_cuenta) {
		this.nro_cuenta = nro_cuenta;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [pin=" + pin + ", nro_cuenta=" + nro_cuenta + ", habilitado=" + habilitado + ", saldo=" + saldo
				+ "]";
	}
	
	public boolean Ingreso(int pin, int tarjeta) {
		
		//Cliente 1 tiene tarjeta 12345678 y su pin es 1234
		
		if(pin == 1234 ) {
			if(tarjeta == 123456789) {
				
				return true; 
			}else {
				return false; 
			}
		}else {
			return false;
		} 
	}
	
	
	public boolean RetirarDinero(Cajero cajero, int dinero) {
		
		//Verifico que tenga plata el cajero y la cuenta 
		if(cajero.getDinero()>=dinero) {
			if(this.getSaldo()<dinero) {
				return false;
			}else {
				//retiro dinero de la cuenta 
				double saldo = this.getSaldo()-dinero;
				this.setSaldo(saldo);
				//descuento del cajero el dinero que retire 
				int aux = cajero.getDinero() - dinero;
				cajero.setDinero(aux);
				return true;
			}
		}else {
			return false;
		}
	}
	
	public boolean DepositarDinero(Cajero cajero, int dinero) {
		
		if(this.habilitado) {
				if(dinero>0) {
					double saldo = this.getSaldo()+dinero;
					this.setSaldo(saldo);
					int aux = cajero.getDinero() + dinero;
					cajero.setDinero(aux);
					return true; 
				}
			}
			return false;
	}
}
