package examen;
import java.util.Scanner;

public class pregunta_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaras y pides los datos
		System.out.print("�que carnet te estás sacando?: ");
		System.out.println("carnets:\n1.A\n2.B \n3.C \n4.D\n5.Salir\n-");
		int carnet = sc.nextInt();
		int tarifa1=0;
		int tarifa2=0;
		int total=0;
		
		//el switch tiene dentro los calculos de cada carnet en cada caso con sus precios correspondientes
		switch(carnet) {
		case 1:
			System.out.println("CARNET A: precio de 150$ ");
			System.out.println("�Cuantas clases has dado? cada clase tiene un precio de 15$: ");
			int numclass=sc.nextInt();
			if(numclass>0) {
				tarifa1=150;
				tarifa2 = 15*numclass;
				total=tarifa1+tarifa2;
				System.out.println("tu tarifa a pagar es de: "+total+"$");
				break;
			}
			else {
				System.err.println("TIENES QUE DAR UN MINIMO DE 1 CLASE");
			}
			
		case 2:
			System.out.println("CARNET B: precio de 325$ ");
			System.out.println("�Cuantas clases has dado? cada clase tiene un precio de 21$: ");
			int numclass2=sc.nextInt();
			if(numclass2>0) {
				tarifa1=325;
				tarifa2 = 21*numclass2;
				total=tarifa1+tarifa2;
				System.out.println("tu tarifa a pagar es de: "+total+"$");
				break;
			}
			else {
				System.err.println("TIENES QUE DAR UN MINIMO DE 1 CLASE");
			}
			
		case 3:
			System.out.println("CARNET C: precio de 520$ ");
			System.out.println("�Cuantas clases has dado? cada clase tiene un precio de 36$: ");
			int numclass3=sc.nextInt();
			if (numclass3>0) {
				tarifa1=520;
				tarifa2 = 36*numclass3;
				total=tarifa1+tarifa2;
				System.out.println("tu tarifa a pagar es de: "+total+"$");
				break;
			}
			else {
				System.err.println("TIENES QUE DAR UN MINIMO DE 1 CLASE");
			}
			
		case 4:
			System.out.println("CARNET D: precio de 610$ ");
			System.out.println("�Cuantas clases has dado? cada clase tiene un precio de 50$: ");
			int numclass4=sc.nextInt();
			if(numclass4>0) {
				tarifa1=610;
				tarifa2 = 50*numclass4;
				total=tarifa1+tarifa2;
				System.out.println("tu tarifa a pagar es de: "+total+"$");
				break;
			}
			else {
				System.err.println("TIENES QUE DAR UN MINIMO DE 1 CLASE");
			}
			
		case 5: System.out.println("adios.");
				break;
		}
		
		sc.close();
	}

}
