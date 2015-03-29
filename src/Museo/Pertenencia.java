package Museo;

public class Pertenencia {
	
	private String pertenencia;//si es pr�stamo o permanente
	private String fechaingreso;//fecha de adquisici�n si es permanente
	private int coste;//coste del objeto si es permanente
	private String coleccion;//nombre de la coleccion a la que pertenece si es un pr�stamo
	private String fecharecibo;//fecha de recepci�n si es un pr�stamo
	private String fechaentrega;//fecha de entrega si es un pr�stamo
	
	//ingreso e ingresoN se inician en main para ingresar los datos
	public void ingresoPertenencia(String ingreso){
		this.pertenencia=ingreso;//se ingresa la pertenencia del objeto, si es pr�stamo o permanente
	}
	public void ingresoFechaingreso(String ingreso){
		if(pertenencia.equals("permanente")){
			this.fechaingreso=ingreso;//ingreso de la fecha de adquisici�n si es permanente
		}
	}
	public void ingresoCoste(int ingresoN){
		if(pertenencia.equals("permanente")){
			this.coste=ingresoN;//ingreso del coste del objeto si es permanente
		}
	}
	public void ingresoColeccion(String ingreso){
		if(pertenencia.equals("pr�stamo")){
			this.coleccion=ingreso;//ingreso del nombre de la colecci�n si es un pr�stamo
		}
	}
	public void ingresoFecharecibo(String ingreso){
		if(pertenencia.equals("pr�stamo")){
			this.fecharecibo=ingreso;//ingreso de la fecha de recepci�n si es un pr�stamo
		}
	}
	public void ingresoFechaentrega(String ingreso){
		if(pertenencia.equals("pr�stamo")){
			this.fechaentrega=ingreso;//ingreso de la fecha de entrega si es un pr�stamo
		}
	}

}
