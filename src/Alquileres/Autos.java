package Alquileres;

public class Autos {
	
	private int garage=0;//garage asignado al veh’culo
	private int matricula=0;//matr“cula del veh’culo
	private int modelo=0;//modelo del veh’culo
	private String marca;//marca del veh’culo
	
	//ingreso e ingresoN se inicializan en main para agregar los datos
	public void agregarGarage(int ingresoN){
		this.garage=ingresoN;//ingreso del garage asignado al veh’culo en esta clase
	}
	public void agregarMatricula(int ingresoN){
		this.matricula=ingresoN;//ingreso de la matr’cula en esta clase
	}
	public void agregarModelo(int ingresoN){
		this.modelo=ingresoN;//ingreso del modelo en esta clase
	}
	public void agregarMarca(String ingreso){
		this.marca=ingreso;//ingreso de la marca en esta clase
	}

}
