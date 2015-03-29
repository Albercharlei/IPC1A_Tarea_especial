package Zoo;

public class Habitats {

	private String habitat;//nombre del habitat
	private String clima;//clima del habitat
	private String vegetacion;//vegetacion predominante del habitat
	private String continente;//continente(s) del habitat
	//definir ingreso en main para agregar los datos
	public void agregarHabitat(String ingreso){
		this.habitat=ingreso;//ingreso del nombre del habitat en esta clase
	}
	
	public void agregarClima(String ingreso){
		this.clima=ingreso;//ingreso del clima en esta clase
	}
	
	public void agregarVegetacion(String ingreso){
		this.vegetacion=ingreso;//ingreso de la vegetacion predominante en esta clase
	}
	
	public void agregarContinente(String ingreso){
		return continente;//ingreso del o los continentes en esta clase
	}

}
