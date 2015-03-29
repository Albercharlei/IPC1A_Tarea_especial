package Alquileres;
import Autos.Reservas;
import Alquileres.Reservas;
public class Clientes {
	
	private String cliente;//nombre del cliente
	private String direccion;//direccion del cliente
	private int dpi;//dpi del cliente
	private int telefono;//n�mero de tel�fono del cliente
	private int aval;//n�mero de otros clientes que avalan
	private Reservas reserva;//c�digo(s) de reserva(s) del cliente
	//ingreso e ingresoN se inician en main para agregar los datos
	public void agregarCliente(String ingreso){
		this.cliente=ingreso;//ingreso del nombre del cliente en esta clase
	}
	public void agregarDireccion(String ingreso){
		this.direccion=ingreso;//ingreso de la direcci�n en esta clase
	}
	public void agregarDPI(int ingresoN){
		this.dpi=ingresoN;//ingreso del dpi en esta clase
	}
	public void agregarTelefono(int ingresoN){
		this.telefono=ingresoN;//ingreso del n�mero de tel�fono del cliente en esta calse
	}
	public void agregarAval(int ingresoN){
		this.aval=ingresoN;//ingreso del n�mero de clientes que avalan al cliente en esta calse
	}
	public Reservas agregarCodigo(Reservas codigo){
		return codigo;//c�digo de la(s) reserva(s) ingresados en la clase Reservas
	}

}
