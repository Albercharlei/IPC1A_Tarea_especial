package Museo;

import Museo.Artista;
import Museo.Tipo;

public class Objeto {
	//id,artista,a–o de creacion,titulo,descripcion,tipo
		private int id;//nœmero de identificaci—n del objeto
		private String a–o;//a–o de creaci—n si se conoce o no
		private String titulo;//t’tulo del objeto
		private String descripcion;//descripci—n del objeto
		private String origen;//pa’s de origen del objeto
		private String epoca;//Žpoca de creaci—n del objeto
		private Tipo tipo;//tipo de objeto
		private Artista nombre;//nombre del artista
		
		//ingreso e ingresoN se inician en main para agregar los datos
		public void agregarID(int ingresoN){
			this.id=ingresoN;//ingreso del id en esta clase
		}
		public void agregarA–o(String ingreso){
			this.a–o=ingreso;//ingreso del a–o de creaci—n en esta clase
		}
		public void agregarTitulo(String ingreso){
			this.titulo=ingreso;//ingreso del t’tulo del objeto en esta clase
		}
		public void agregarDescripcion(String ingreso){
			this.descripcion=ingreso;//ingreso de la descripci—n del objeto en esta clase
		}
		public void agregarOrigen(String ingreso){
			this.origen=ingreso;//ingreso del pa’s del objeto en esta clase
		}
		public void agregarEpoca(String ingreso){
			this.epoca=ingreso;//ingreso de la Žpoca del objeto en esta clase
		}
		public Tipo agregarTipo(Tipo tipo){
			return tipo;//el tipo del objeto ingresado en la clase Tipo
		}
		public Artista agregarNombre(Artista nombre){
			return nombre;//el nombre del artista ingresado en la clase Artista
		}

}
