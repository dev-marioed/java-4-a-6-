import java.util.Scanner;

/*el programa genera un arrego con 20 numeros aleatorios. Realta los múltiplos de 5 o 7 a decisión del usuario
 * 
 * Dato de entrada: int para decidir los multiplos a resaltar (1 o 2)
 * Dato de salida: un arreglo dond e estan resaltados los multiplos elegidos por el usuario
 * */

public class Ejercicio6 {

	public static void main(String[] args) { //agregar un main
		// TODO Auto-generated method stub
		int n[] = new int[20]; //corrección: declarar un arreglo de longitud 20
		int multiplo;
		
		
	    for (int i = 0; i < 20; i++) { //corrección i++
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
	    System.out.print("\n¿Qué números quiere resaltar? "); //corrección print
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	    Scanner sc=new Scanner(System.in); //corrección: scanner es la clase adecuada para obtener datos del usuario
	    
	    int opcion = sc.nextInt(); //corrección: delarar el método adecuado para captuar la decisión del usuario
	 
	    	multiplo = (opcion == 1) ? 5 : 7; //corrección: declarar el if que asignará el valor a multiplo
		
	    
    	for (int i : n) { //corrección: declarar adecuadamente el foreach
			if(i%multiplo==0) {
				System.out.print("["+i+"]");
			}else {
				System.out.print(i+" ");
			}//else
		}//foreach

	    


}//main
	
}//class	
