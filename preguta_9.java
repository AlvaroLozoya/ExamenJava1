package examen;
import java.util.Scanner;

public class preguta_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaramos las variables
		int contador=0, cuentas;
		boolean a = true;
		
		//hacemos un if que contiene un bucle que realiza las cuentas
		do {
			System.out.print("Introduce un número del 1 al 20 para ver los resultados pares de su tabala de multiplicar: ");
			int num=sc.nextInt();
			if(num>0 && num<=20) {
				while(contador<=10) {
					cuentas=num*contador;	
					//calculamos el resto para sacar los numero pares
					int cuentas2=cuentas%2;
					contador++;
					//imprimimos los pares
					if(cuentas2==0) {
						System.out.println(cuentas);
					}																									
				}
				a = false;
			}
			//damos robustez
			else {
				System.out.println("DEBE SER ENTRE 1-20");
			}
		}while(a);
														
		sc.close();

	}

}
