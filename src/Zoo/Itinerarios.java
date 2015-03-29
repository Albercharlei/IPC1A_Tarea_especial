package Zoo;
import Zoo.Zonas;
import Zoo.Guias;
public class Itinerarios {

	private int codigo;//codigo del itinerario
	private int duracion;//duracion del itinerario
	private int longitud;//longitud del itinerario
	private int visitantes;//maximo numero de visitantes del itinerario
	private int especies;//numero de especies incluidas en el itinerario
	private Zonas zona;//zona(s) del itinerario
	private Guias guia;//guia(s) del itinerario
	//definir ingresoN en main para agregar los datos
	public void agregarCodigo(int ingresoN){
		this.codigo=ingresoN;//ingreso del codigo en esta clase
	}
	public void agregarDuracion(int ingresoN){
		this.duracion=ingresoN;//ingreso de la duracion del recorrido en esta clase
	}
	public void agregarLongitud(int ingresoN){
		this.longitud=ingresoN;//ingreso de la longitud del recorrido en esta clase
	}
	public void agregarVisitantes(int ingresoN){
		this.visitantes=ingresoN;//ingreso del nœmero m‡ximo de visitantes en esta calse
	}
	public void agregarEspecies(int ingresoN){
		this.especies=ingresoN;//ingreso del nœmero de especies en esta clase
	}
	public Zonas agregarZona(Zonas ingreso){
		return zona;//la zona se ingresa en la clase Zonas
	}
	public Guias agregarGuia(Guias ingreso){
		return guia;//el o los gu’as se ingresan en la clase Guias
	}

}
