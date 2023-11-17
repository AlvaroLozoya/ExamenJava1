package examen;
import java.util.Scanner;
public class pregunta_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaramos la constante		
		final double PI=3.14;
		//intro y declaracion de variables
		System.out.println("\t\t\tcalculo de areas");
		System.out.println("\t\t\t----------------");
		System.out.println("1.Circulo\n2.Triangulo\n3.Cuadrado\n9.salir");
		System.out.print("ELIGE: ");
		int area=sc.nextInt();	
		double areas;
		
		//switch que realiza las cuentas
		switch(area){
		case 1: 
			System.out.print("Circulo: Introduce el radio: ");
			double radio=sc.nextInt();
			radio=radio*radio;
			areas=PI*radio;
			System.out.println("el area del circulo es: "+areas);
			break;
			
		case 2:
			System.out.print("Triangulo: Introduce la base: ");
			double base=sc.nextInt();
			System.out.print("Introduce la altura: ");
			double altura=sc.nextInt();
			areas= base*altura;
			areas=areas/2;
					
			System.out.println("el area del triangulo es: "+areas);
			break;

		case 3:
			System.out.print("cuadrado: Introduce el lado: ");
			double lado=sc.nextInt();
			areas=lado*lado;
			System.out.println("el area del cuadrado es: "+areas);
			break;

		case 9: 
			System.out.println("adios");
			break;
		
		}
		
		sc.close();
	}

}
