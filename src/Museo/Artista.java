package Museo;

public class Artista {
	
	private String nombre;//nombre del artista
	private String nacimiento;//fecha de nacimiento del artista
	private String defuncion;//fecha de defunci—n del artista si es el caso
	private String pais;//pa’s de origen del artista
	private String epoca;//Žpoca del artista
	private String estilo;//estilo principal del artista
	private String descripcion;//descripci—n del artista
	
	//ingreso se inicia en main para agregar los datos
	private void agregarNombre(String ingreso){
		this.nombre=ingreso;//ingreso del nombre del artista en esta clase
	}
	private void agregarNacimiento(String ingreso){
		this.nacimiento=ingreso;//ingreso de la fecha de nacimiento del artista en esta clase
	}
	private void agregarDefunci—n(String ingreso){
		this.defuncion=ingreso;//ingreso de la fecha de defunci—n del artista en esta clase
	}
	private void agregarPais(String ingreso){
		this.pais=ingreso;//ingreso del pa’s del artista en esta clase
	}
	private void agregarEpoca(String ingreso){
		this.epoca=ingreso;//ingreso de la Žpoca del artista en esta clase
	}
	private void agregarEstilo(String ingreso){
		this.estilo=ingreso;//ingreso del estilo del artista en esta clase
	}
	private void agregarDescripci—n(String ingreso){
		this.descripcion=ingreso;//ingreso de la descripci—n del artista en esta clase
	}

}
