package Museo;

public class Pertenencia {
	
	private String pertenencia;//si es préstamo o permanente
	private String fechaingreso;//fecha de adquisición si es permanente
	private int coste;//coste del objeto si es permanente
	private String coleccion;//nombre de la coleccion a la que pertenece si es un préstamo
	private String fecharecibo;//fecha de recepción si es un préstamo
	private String fechaentrega;//fecha de entrega si es un préstamo
	
	//ingreso e ingresoN se inician en main para ingresar los datos
	public void ingresoPertenencia(String ingreso){
		this.pertenencia=ingreso;//se ingresa la pertenencia del objeto, si es préstamo o permanente
	}
	public void ingresoFechaingreso(String ingreso){
		if(pertenencia.equals("permanente")){
			this.fechaingreso=ingreso;//ingreso de la fecha de adquisición si es permanente
		}
	}
	public void ingresoCoste(int ingresoN){
		if(pertenencia.equals("permanente")){
			this.coste=ingresoN;//ingreso del coste del objeto si es permanente
		}
	}
	public void ingresoColeccion(String ingreso){
		if(pertenencia.equals("préstamo")){
			this.coleccion=ingreso;//ingreso del nombre de la colección si es un préstamo
		}
	}
	public void ingresoFecharecibo(String ingreso){
		if(pertenencia.equals("préstamo")){
			this.fecharecibo=ingreso;//ingreso de la fecha de recepción si es un préstamo
		}
	}
	public void ingresoFechaentrega(String ingreso){
		if(pertenencia.equals("préstamo")){
			this.fechaentrega=ingreso;//ingreso de la fecha de entrega si es un préstamo
		}
	}

}
