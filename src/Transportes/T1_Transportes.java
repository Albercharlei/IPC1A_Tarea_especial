import java.util.Scanner;
public class T1_Transportes {

	public static void main(String[] args) {
		String conductor[]={};//nombres de cada uno
		double pago[]={};//pago para cada uno de los conductores
		double sueldo=0;//c‡lculo de la cantidad a pagar
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el nombre del conductor");
		String nombre=s.next();//variable para ingresar nombre
		String transporte;//variable para ingresar tipo de transporte
		int horas=0;//ingreso del nœmero de horas
		int ton=0;//cantidad de toneladas para transporte de mercancias
		for(int a=0;a<conductor.length;a++){
			//a es el numero del conductor y del pago de cada uno
			if (nombre.equals(conductor[a])){
				System.out.println("Ingrese el nœmero de horas de "+conductor[a]);
				horas=s.nextInt();
				System.out.println("Ingrese el tipo de transporte ");
				transporte=s.next();
				if(transporte.equals("personas")){
					//a es la posici—n de la persona en el array conductor y
					//la posici—n de su pago en el array pago
					System.out.println("Ingrese el tipo de transporte de personas");
					transporte=s.next();//ingreso de colectivo o no colectivo
					if(transporte.equalsIgnoreCase("colectivo")){
						sueldo=700+horas*(5+1);//c‡lculo del sueldo para transporte colectivo
						System.out.println("El pago para "+conductor[a]+" es "+sueldo);
						pago[a]=sueldo;//ingreso del sueldo en el array pago
					}
					if(transporte.equals("no colectivo")){
						sueldo=700+horas*(5+(0.5));//c‡lculo del sueldo para transporte no colectivo
						System.out.println("El pago para "+conductor[a]+" es "+sueldo);
						pago[a]=sueldo;//ingreso del sueldo en el array pago
					}
				}
				if(transporte.equals("mercancias")){
					System.out.println("Ingrese el nœmero de toneladas");
					ton=s.nextInt();
					sueldo=700+horas*(5+2*ton);//c‡lculo del sueldo para mercancias
					System.out.println("El pago para "+conductor[a]+" es "+sueldo);
					pago[a]=sueldo;//ingreso del sueldo en el array pago
				}
				if(transporte.equals("mercancias peligrosas")){
					System.out.println("Ingrese el nœmero de toneladas");
					ton=s.nextInt();
					sueldo=700+horas*(5+2.5*ton);//c‡lculo del sueldo para mercancias peligrosas
					System.out.println("El pago para "+conductor[a]+" es "+sueldo);
					pago[a]=sueldo;//ingreso del sueldo en el array pago
				}
			}
		}
		
	}

}
