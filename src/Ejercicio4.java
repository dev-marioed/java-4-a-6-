//En la parte superior debes escribir en un comentario cual es el funcionamiento de la clase y cuales son los datos de entrada y salida, en caso de tener.
/*
El código sirve para correr el juego de "piedra papel o tijera"

*Datos de entrada: j1 y j2 reciben como string la elección del jugador
*Datos de salida: Se muestra en consola al jugador que ganó
*
*/

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		 Integer g=2; //ganador  
		 
		 String mensaje;
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
	    String j2 = s.nextLine();
	    
	    //System.out.println(j1.equals(j2));
	    
	    if (
	    		(j1.equals("piedra")||j1.equals("papel")||j1.equals("tijera")) //se debe revisar que los valores ingresados a j1 y j2 sean válidos para continuar con el juego
	    	&&
	    	(j2.equals("piedra")||j2.equals("papel")||j2.equals("tijera")) 
	    	){
	    	
	    	
	    	if (j1.equals(j2)) { //equals es el método adecuado porque compara el contenido de la variable j1 y j2
	  	      System.out.println("Empate");
	  	    } else {
	  	    	
	  	      switch(j1) {
	  	     
	  	        case "piedra":
	  	          if (j2.equals("tijera")) {
	  	            g = 1; //gana el 1
	  	            
	  	            
	  	          }//if
	  	         
	  	          break;//correción: añadí breaks en cada case
	  	          
	  	        case "papel":
	  	          if (j2.equals("piedra")) {
	  	            g = 1; //gana el 1
	  	          }//if //corrección: abrir y cerra correctamente las llaves de toda la clase
	  	          
	  	         
	  	          break;
	  	          
	  	        case "tijera":
	  	          if (j2.equals("papel")) {
	  	            g = 1; 
	  	          }//if
	  	          
	  	         
	  	          break;
	  	          
	  	        default:
	  	        	mensaje=("no hay ganador");
	  	        	break;
	  	        	
	  	        	
	  	      }//switch
	  	      mensaje=("el ganador es el jugador "+ g);
	  	      System.out.println(mensaje);
	  	    }//else
	    	
	    	
	    	
	    }else {// en caso de que se ingresen otros valores, no se ejecuta el código del juego
	    	System.out.println("entrada inválida, solo se admite piedra, papel o tijera");
	    }
	    
	    
	    
	    
	    
	    
	  
	  

	}//main
}//class

