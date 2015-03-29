package Zoo;
import Zoo.Zonas;
import Zoo.Habitats;
import Zoo.Cuidadores;

public class Especies {

	private String especie;//nombre de especie
	private String cientifico;//nombre cientifico
	private String descripcion;//descripcion de la especie
	private Zonas zona;//zona de la especie
	private Habitats habitat;//h‡bitat de la especie
	private Cuidadores cuidador;//cuidador(es) de la especie
	//definir ingreso en main para agregar los datos
	public void agregarEspecie(String ingreso){
		this.especie=ingreso;//ingreso del nombre en esta clase
	}
	
	public void agregarCientifico(String ingreso){
		this.cientifico=ingreso;//ingreso del nombre cientifico en esta clase
	}
	
	public void agregarDescripcion(String ingreso){
		this.descripcion=ingreso;//ingreso de la descripcion en esta clase
	}
	
	public Zonas agregarZona(Zonas ingreso){
		return zona;//la zona se ingresa en la clase Zonas
	}
	
	public Habitats agregarHabitat(Habitats ingreso){
		return habitat;//el h‡bitat se ingresa en la clase Habitats
	}
	
	public Cuidadores agregarCuidador(Cuidadores ingreso){
		return cuidador;//el h‡bitat se ingresa en la clase Habitats
	}

}


