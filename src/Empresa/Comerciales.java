package Empresa;

public class Comerciales {
	private String nombre;//nombre del empleado
	private String direccion;//direccion del empleado
	private String telefono;//telefono del empleado
	private String fecha;//fecha de ingreso del empleado
	private double sueldo;//sueldo del empleado
	private double contratos;//nœmero de contratos hechos por el empleado
	
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
	
	public void agregarContratos(double ingresoN){
		this.contratos=ingresoN;//ingreso del nœmero de contratos hechos por el empleado en esta clase
	}
	
	public void agregarSueldo(double ingresoN){
		this.sueldo=ingresoN*(1+0.01*contratos);//ingreso del sueldo en esta clase
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
