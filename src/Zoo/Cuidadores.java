package Zoo;
import Zoo.Especies;
public class Cuidadores {

	private String cuidador;//nombre del cuidador
	private String direccion;//direccion del cuidador
	private String telefono;//telefono del cuidador
	private String fecha;//fecha de ingreso del cuidador
	private Especies especie;//especie(s) asignada(s) al cuidador
	//definir ingreso en main para ingresar los datos
	public void agregarCuidador(String ingreso){
		this.cuidador=ingreso;//ingreso del nombre del cuidador en esta clase
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
	
	public Especies agregarEspecie(Especies ingreso){
		return especie;//la(s) especie(s) se ingresa(n) en la clase Especies
	}

}
