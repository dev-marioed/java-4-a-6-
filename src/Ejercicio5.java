import java.util.Scanner;
/*el programa es para determinar si el número introducido
es afortunado o no en función de su residuo en un ciclo de divisiones.


Valor de entrada= un entero
valor de salida = un string indicando si el número introducido es afortunado o no
*/
public class Ejercicio5 {

	public static void main(String[] args) { //corrección, insertar un main para que corra el programa
		 Scanner s = new Scanner(System.in); //importar scanner de java.util y especificar que es una entrada del sistema
		    
		    
		    System.out.println("Introduzca un número: "); //corrección: uso de comas dobles para el string a imprimir 
		    int ni = s.nextInt(); //ni se debe declara como un integer
		    int c = ni; //corrección c no puede almacenar el string
		    
		    int afo = 0;
		    int noAfo = 0;
		    
		    while (ni > 0) { //el 
			  int digito = (int)(ni % 10); //digito es el residuo de dividir Ni entre 10 
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++; // es un numero afortunado, inicia un ciclo infinito porque no divide
				ni/=10; //Correción: dividir n1 entre 10para que el ciclo while sea finito
		      } else {
				noAfo++; //No es un numero afortunado 
			  
			  ni /= 10; //dividir ni entre 10
		    }//else

		    
		    
		  }//while
		    //Corrección: la decisión se coloca fuera del ciclo while porque solo debe ejecutarse 1 vez
		    if (afo > noAfo) { //si afo supera a no afo, es un afortunado
			      System.out.println("El " + c + " es un número afortunado."); //corrección: un typo en println marcaba un error
			    } else {
			      System.out.println("El " + c + " no es un número afortunado.");
			    }//else
		
	}//main
	   
	  
	}//class