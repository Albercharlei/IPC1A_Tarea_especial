package Museo;

public class Tipo {
	
	private String tipo;//tipo de objeto
	private String tipopintura;//el tipo de pintura si es una pintura
	private String soporte;//el sporte si es una pintura
	private String estilopintura;//el soporte si es una pintura
	private String material;//el material si es una escultura
	private String estiloescultura;//el estilo si es una escultura
	private int altura;//la altura si es una escultura
	private int peso;//el peso si es una escultura
	
	//ingreso e ingresoN se inician en main para agregar los datos
	public void agregarTipo(String ingreso){
		this.tipo=ingreso;//ingreso del tipo en esta clase
	}
	public void agregarTipopintura(String ingreso){
		if(tipo.equals("pintura")){
			this.tipopintura=ingreso;//ingreso del tipo de pintura en esta clase
		}
	}
	public void agregarSoporte(String ingreso){
		if(tipo.equals("pintura")){
			this.soporte=ingreso;//ingreso del soporte de la pintura en esta clase
		}
	}
	public void agregarEstilopintura(String ingreso){
		if(tipo.equals("pintura")){
			this.estilopintura=ingreso;//ingreso del estilo de pintura en esta clase
		}
	}
	public void agregarEstiloescultura(String ingreso){
		if(tipo.equals("escultura")){
			this.estiloescultura=ingreso;//ingreso del estilo de escultura en esta clase
		}
	}
	public void agregarMaterial(String ingreso){
		if(tipo.equals("escultura")){
			this.material=ingreso;//ingreso del material de escultura en esta clase
		}
	}
	public void agregarAltura(int ingresoN){
		if(tipo.equals("escultura")){
			this.altura=ingresoN;//ingreso de la altura de escultura en esta clase
		}
	}
	public void agregarPeso(int ingresoN){
		if(tipo.equals("escultura")){
			this.peso=ingresoN;//ingreso del peso de escultura en esta clase
		}
	}

}
