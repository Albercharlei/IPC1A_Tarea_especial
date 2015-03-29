package Alquileres;
import Alquileres.Clientes;
public class Reservas {
	
	private String agencia;//agencia en la cual se hace la reserva
	private int codigo=0;//c—digo de la reserva
	private int fechainicio=0;//fecha de inicio de la reserva
	private int fechafin=0;//fecha de finalizaci—n de la reserva
	private int precio=0;//precio de la reserva
	private int galones=0;//cantidad de galones en el tanque
	private int total=0;//precio total de la reserva
	private Clientes cliente;//nombre del cliente que hace la reserva
	
	//ingreso e ingresoN se inicializan en main para agregar los datos
	public void agregarAgencia(String ingreso){
		this.agencia=ingreso;//ingreso de la agencia en esta clase
	}
	public void agregarCodigo(int ingresoN){
		this.codigo=ingresoN;//ingreso del c—digo de la reserva en esta clase
	}
	public void agregarFechaInicio(int ingresoN){
		this.fechainicio=ingresoN;//ingreso de la fecha de inicio en esta clase
	}
	public void agregarFechaFin(int ingresoN){
		this.fechafin=ingresoN;//ingreso de la fecha de finalizaci—n en esta clase
	}
	public void agregarPrecio(int ingresoN){
		this.precio=ingresoN;//ingreso del precio de la reserva en esta clase
	}
	public void agregarGalones(int ingresoN){
		this.galones=ingresoN;//ingreso de la cantidad de galones en esta clase
	}
	public void agregarTotal(int ingresoN){
		this.total=ingresoN;//ingreso del total de la reserva en esta clase
	}
	public boolean agregarEntrega(String ingreso){//verificaci—n de la entrega
		if(ingreso.equals("entregado")){
			return true;
		}	
		else{
			return false;
		}
	}
	public Clientes agregarCliente(Clientes cliente){
		return cliente;//nombre del cliente ingresado en la clase Clientes
	}

}
