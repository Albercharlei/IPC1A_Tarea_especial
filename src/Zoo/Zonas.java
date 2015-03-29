package Zoo;
import Zoo.Especies;
import Zoo.Itinerarios;
public class Zonas {

	private String zona;//nombre de la zona
	private String extension;//extension de la zona
	private Especies especie;//especies contenidas en la zona
	private Itinerarios itinerario;//itinerarios de las zonas
	//definir ingreso en main para agregar los datos
	public void agregarZona(String ingreso){
		this.zona=ingreso;//ingreso de nombre de zona de la clase
	}
	
	public void agregarExtension(String ingreso){
		this.extension=ingreso;//ingreso de la extension de la zona de la clase
	}
	
	public Especies agregarEspecie(Especies ingreso){
		return especie;//la especie se ingresa en la clase Especies
	}
	
	public Itinerarios agregarItinerario(Itinerarios ingreso){
		return itinerario;//los itinerarios se ingresasn en la clase Itinerarios
	}
}
