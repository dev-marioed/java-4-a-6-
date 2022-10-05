import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		 Integer g=2; //ganador  
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
	    String j2 = s.nextLine();
	    
	    //System.out.println(j1.equals(j2));
	    
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	    	
	      switch(j1) {
	     
	        case "piedra":
	          if (j2.equals("tijera")) {
	            g = 1; //gana el 1
	            
	            
	          }//if
	         
	          break;
	          
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1; //gana el 1
	          }//if
	          
	         
	          break;
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1; 
	          }//if
	          
	         
	          break;
	          
	        default:
	        	System.out.println("entrada inválida");
	        	break;
	        	
	        	
	      }//switch
	      System.out.print("el ganador es"+ g);
	      
	    }//else
	
	  

	}//main
}//class

