package examen;

import java.util.Scanner;

public class pregunta_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaramos las constantes
		final double DESCUENTO=0.8;
		
		double precio=10;
		int cantidad=0;
		boolean a = true;
		System.out.print("el coste del articulo a comprar  es de 10$,\n �Que cantidad va a llevarse?:");
		//hacemos un bucle para hacer que se repita y que calcule el precio del producto
		do{
			cantidad=sc.nextInt();
			//calculamos el precio
			if(cantidad>0) {
				precio=precio*cantidad;
				precio=precio*DESCUENTO;
				System.out.println("El producto tiene un descuento del 20% que se aplicara autom�ticamente, el precio de su compra\n es de: "+precio+"$");
				//salida del bucle
				a = false;
			}
			//para dar robustez al programa
			else if(cantidad==0) {
				System.out.println("Que tenga un buen dia :)");
				//salida del bucle
				a = false;
			}
			else {
				System.err.println("la cantidad no puede ser negativa");
				System.out.println("introduce de nuevo la cantidad: ");
				
			}		
		}while(a);
		
		sc.close();

	}

}
