package Alquileres;
import Autos.Reservas;
import Alquileres.Reservas;
public class Clientes {
	
	private String cliente;//nombre del cliente
	private String direccion;//direccion del cliente
	private int dpi;//dpi del cliente
	private int telefono;//número de teléfono del cliente
	private int aval;//número de otros clientes que avalan
	private Reservas reserva;//código(s) de reserva(s) del cliente
	//ingreso e ingresoN se inician en main para agregar los datos
	public void agregarCliente(String ingreso){
		this.cliente=ingreso;//ingreso del nombre del cliente en esta clase
	}
	public void agregarDireccion(String ingreso){
		this.direccion=ingreso;//ingreso de la dirección en esta clase
	}
	public void agregarDPI(int ingresoN){
		this.dpi=ingresoN;//ingreso del dpi en esta clase
	}
	public void agregarTelefono(int ingresoN){
		this.telefono=ingresoN;//ingreso del número de teléfono del cliente en esta calse
	}
	public void agregarAval(int ingresoN){
		this.aval=ingresoN;//ingreso del número de clientes que avalan al cliente en esta calse
	}
	public Reservas agregarCodigo(Reservas codigo){
		return codigo;//código de la(s) reserva(s) ingresados en la clase Reservas
	}

}
