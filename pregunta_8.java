package examen;
import java.util.Scanner;

public class pregunta_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaramos las variables
		int contador=0; 
		boolean a = true;

		//hacemos un bucle para que se repita en caso de error
		do {
			//marcamos un limite para que no explote el programa
			System.out.print("introduce un n�mero positivo entre 1-15 para ver su factorial:");
			int num=sc.nextInt();
			int num2=1;
			//cuentas del factorial
			if(num>0 && num<=15) {
				contador=num-num2;
				while(contador>0) {					
					num=num*contador;					
					contador--;
				}
				System.out.print("el factorial del numero introducido es: "+num);
				//salida del bucle
				a = false;
			}
			else {
				//le damos robustez al programa con el mensaje de error
				System.err.println("Algo salio mal");
			}
			
		}while(a);
		sc.close();

	}

}
