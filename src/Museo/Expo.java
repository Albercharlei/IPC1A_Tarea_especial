package Museo;
import Museo.Objeto;
public class Expo {
	
	private String nombre;//nombre de la exposici—n
	private String comienzo;//fecha de inicio de la exposic—n
	private String finalizacion;//fecha de finalizaci—n de la exposici—n
	private Objeto titulo;//t’tulo del objeto de la exposic—n
	
	//ingreso se inicia en main para ingresar los datos
	private void agregarNombre(String ingreso){
		this.nombre=ingreso;//ingreso del nombre de la exposic—n en esta clase
	}
	private void agregarComienzo(String ingreso){
		this.comienzo=ingreso;//ingreso de la fecha de inicio de la exposic—n en esta clase
	}
	private void agregarFinalizacion(String ingreso){
		this.finalizacion=ingreso;//ingreso de la fecha de finalizaci—n de la exposic—n en esta clase
	}
	private Objeto agregarTitulo(Objeto titulo){
		return titulo;//t’tulo del objeto ingresado en la clase Objeto
	}

}
