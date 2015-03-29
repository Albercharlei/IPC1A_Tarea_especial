package Zoo;
import Zoo.Itinerarios;
public class Guias {

	private String guia;//nombre del guia
	private String direccion;//direccion del guia
	private String telefono;//telefono del guia
	private String fecha;//fecha de ingreso del guia
	private Itinerarios itinerario;//itinerarios del guia
	//definir ingreso en main para agregar los datos
	public void agregarGuia(String ingreso){
		this.guia=ingreso;//ingreso del nombre del guia en esta clase
	}
	
	public void agregarDireccion(String ingreso){
		this.direccion=ingreso;//ingreso de la direccion en esta clase
	}
	
	public void agregarTelefono(String ingreso){
		this.telefono=ingreso;//ingreso del numero de telefono en esta clase
	}
	
	public void agregarFecha(String ingreso){
		this.fecha=ingreso;//ingreso de la fecha de ingreso en esta clase
	}
	
	public Itinerarios agregarItinerario(String ingreso){
		return itinerario;//itinerarios ingresados en la clase Itinerario
	}
}
