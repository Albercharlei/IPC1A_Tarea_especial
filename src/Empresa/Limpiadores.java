package Empresa;

public class Limpiadores {
	private String nombre;//nombre del empleado
	private String direccion;//direccion del empleado
	private String telefono;//telefono del empleado
	private String fecha;//fecha de ingreso del empleado
	private double sueldo;//sueldo del empleado
	private double extras;//nœmero de horas extra del empleado
	
	//definir ingreso e ingresoN en main para agregar los datos
	public void agregarNombre(String ingreso){
		this.nombre=ingreso;//ingreso del nombre del empleado en esta clase
	}
	
	public void agregarDireccion(String ingreso){
		this.direccion=ingreso;//ingreso de la direccion en esta clase
	}
	
	public void agregarTelefono(String ingreso){
		this.telefono=ingreso;//ingreso del nœmero de telefono en esta clase
	}
	
	public void agregarFecha(String ingreso){
		this.fecha=ingreso;//ingreso de la fecha de ingreso en esta clase
	}
	
	public void agregarExtras(double ingresoN){
		this.extras=ingresoN;//ingreso del nœmero de horas extras ene sta clase
	}
	
	public void agregarSueldo(double ingresoN){
		this.sueldo=ingresoN*(1+0.005*extras);//ingreso del sueldo en esta clase
	}
	
	public boolean agregarContrataci—n(String ingreso){//contrataci—n o despido del empleado
		if(ingreso.equals("contratado")){
			return true;
		}
		else{
			if(ingreso.equals("despedido")){
			}
		}
		return false;
	}

}
