import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login();


	}
	
	public static void Login() {
		imprimirmenu();
	}
	
	
	//Este menu se imprime como menu principal
	//Permite acceder como cliente o como empleado 
	public static  void imprimirmenu() {
		Scanner entrada = new Scanner(System.in);
		
		Cajero cajero = new Cajero(500,10,1,"Avenida corrientes 2037",1);
		System.out.println("----------------------------------------------------");
			System.out.println("Bienvenido al cajero N°" + cajero.getID());
			System.out.println("Ubicación: " + cajero.getUbicacion() );
			System.out.println("Por favor escoja una de las siguientes opciones");
			System.out.println("Acceder como: ");
			System.out.println("1.Cliente ");
			System.out.println("2.Empleado");
			System.out.println("3.Salir del cajero");
		System.out.println("----------------------------------------------------");
			
			
			int opcion = entrada.nextInt();
			switch (opcion) {
			case 1: 
				IngresoCliente(cajero);
				
				break;
			case 2: ;
				IngresoEmpleado(cajero);
				break;
			case 3: 
				System.out.println("Hasta pronto ~~");
				System.exit(opcion);
				
				break;
				default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				imprimirmenu();
					break;
				}

	}
	//Ingresar como cliente me permite acceder a las funciones de retirar e ingresar dinero 
	//Como no estoy trabajando con una DB estoy asumiendo que hay un solo cliente, veremos las listas en las siguientes clases 
	public static void IngresoCliente(Cajero cajero) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese tarjeta ");
		int nrotarjeta =  entrada.nextInt();
		System.out.println(" Ingrese pin");
		int nropin =  entrada.nextInt();
		
		
		//Supongamos que este cliente existe en la base de datos, seria un tanto asi 
		//Esto es una sobrecarga previa 
		Tarjeta tarjeta = new Tarjeta("12345678","10/25");
		Cuenta cuenta = new Cuenta(1234,1,true,1000);
		Cliente cliente = new Cliente("Gamaliel","Quiroz","123456789",1,"vip");
		
		
		if(cuenta.Ingreso(nropin, nrotarjeta)) {
			MenuCliente(cajero,cliente, cuenta );
		}else {
			System.out.println("No se pudo ingresar");
			System.out.println("Vuelva a intentar");
			IngresoCliente(cajero);
		}
		
	}
	
	//ingresar como empleado
	public static void IngresoEmpleado(Cajero cajero) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese tarjeta ");
		int nrotarjeta =  entrada.nextInt();
		System.out.println(" Ingrese pin");
		int nropin =  entrada.nextInt();
		
		
		//Supongamos que este cliente existe en la base de datos, seria un tanto asi 
		//Esto es una sobrecarga previa 
		Tarjeta tarjeta = new Tarjeta("12345678","10/25");
		Empleado empleado = new Empleado("Gamaliel","Quiroz","123456789",1,"CABA");

		
		if(empleado.Ingreso(nropin, nrotarjeta)) {
			MenuEmpleado(cajero);
		}else {
			System.out.println("No se pudo ingresar");
			System.out.println("Vuelva a intentar");
			IngresoEmpleado(cajero);
		}
		
	}
	
	
	
	//Este menu seria el menu de inicio de el cliente 
	public static void MenuCliente(Cajero cajero,Cliente cliente,Cuenta cuenta  ) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
			System.out.println("Bienvenido");
			System.out.println(cliente.getNombre());
			System.out.println("Por favor escoja una de las siguientes opciones");
			System.out.println("1.Retirar dinero ");
			System.out.println("2.Depositar");
			System.out.println("3.Salir de la cuenta n°: " + cuenta.getNro_cuenta());
		System.out.println("----------------------------------------------------");
		int dinero;
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: 
			System.out.println("Ingresar cantidad a retirar");
			dinero = entrada.nextInt();
			RetirarDinero(cajero,cliente,cuenta,dinero);
			
			break;
		case 2: ;
			System.out.println("Ingresar cantidad a depositar");
			dinero = entrada.nextInt();
			DepositarDinero(cajero,cliente,cuenta,dinero);
			break;
		case 3: 
			imprimirmenu();
			break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				break;
		}
	
	}
	
	
	//Menu empleado 
	
	public static void MenuEmpleado(Cajero cajero) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
			System.out.println("Bienvenido");
			System.out.println("Por favor escoja una de las siguientes opciones");
			System.out.println("1.Ingresar dinero ");
			System.out.println("2.Estado de cajero");
			System.out.println("3.Salir de cajero N° " + cajero.getID());
		System.out.println("----------------------------------------------------");
		int dinero;
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: 
			System.out.println("Ingresar dinero");
			dinero = entrada.nextInt();
			IngrearDinero(cajero,dinero);
			
			break;
		case 2: ;
			cajero.verEstado();
			break;
		case 3: 
			imprimirmenu();
			break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				break;
		}
	
	}
	
	//Retiro dinero desde la cuenta del cliente, indicandole de que cuenta retirarla, el monto , y el cajero donde se realiza la operación 
	public static void RetirarDinero(Cajero cajero,Cliente cliente, Cuenta cuenta, int dinero ) {
		
		if(cuenta.RetirarDinero(cajero, dinero)) {
		System.out.println("----------------------------------------------------");
			System.out.println("Operación exitosa ! ");
			System.out.println("Se retiró " + dinero );
			System.out.println("De la cuenta con numero " + cuenta.getNro_cuenta());
			System.out.println("Saldo restante: "+ cuenta.getSaldo());
		System.out.println("----------------------------------------------------");
			MenuCliente(cajero,cliente,cuenta);
		}else {
			System.out.println("no se pudo retirar");
			
			if(cuenta.getSaldo()<dinero) {
				System.out.println("no hay dinero suficient en la cuenta");
			}
			if(cajero.getDinero() < dinero) {
				System.out.println("No hay dinero disponile");
			}
			MenuCliente(cajero,cliente,cuenta);
		}
	}
	
	//Ingreso dinero en la cuenta del cliente, este dinero puede ser utilizado por el cajero 
	public static void DepositarDinero(Cajero cajero, Cliente cliente,Cuenta cuenta, int dinero) {
		
		if(cuenta.DepositarDinero(cajero, dinero)) {
		System.out.println("----------------------------------------------------");
			System.out.println("Operación exitosa ! ");
			System.out.println("Se agrego dinero a la cuenta: " + cuenta.getNro_cuenta() );
			System.out.println("El saldo que tiene ahora es: " + cuenta.getSaldo());
		System.out.println("----------------------------------------------------");
			MenuCliente(cajero,cliente,cuenta);
		}else {
			System.out.println("no se pudo depositar");
			MenuCliente(cajero,cliente,cuenta);
		}
	}
	public static void IngrearDinero(Cajero cajero,int dinero) {
		
		if(cajero.IngresarDinero(dinero)) {
			System.out.println("----------------------------------------------------");
			System.out.println("Operación exitosa ! ");
			System.out.println("Se agrego dinero al cajero");
		System.out.println("----------------------------------------------------");
		MenuEmpleado(cajero);
		}else {
			System.out.println("Error ");
			MenuEmpleado(cajero);
		}
	}
	
	
	
	
	
}
