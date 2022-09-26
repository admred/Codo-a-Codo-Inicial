import java.util.Scanner;


public class SePuedeJubilar {
    public static void main(String[] args) {
	    int edad;
        char sexo;

         System.out.println("Ingresar Sexo:");
         Scanner leer = new Scanner(System.in) ;
         sexo=leer.next().charAt(0);
         leer.close();

         System.out.println("Ingresar Edad:");
         leer = new Scanner(System.in) ;
         edad = leer.nextInt();
         leer.close();
         
         
         if ( ( sexo == 'f' ||  sexo == 'F') &&  edad >= 60 ) {
             System.out.println("Se puede jubilar con sexo="+sexo+" y edad="+edad);
             
         } else if ( (sexo == 'm' || sexo == 'M') &&  edad >= 65 ) {
             System.out.println("Se puede jubilar con sexo="+sexo+" y edad="+edad);
             
         } else {
             System.out.println("No puede jubilar.");
         }
     
	 }	
}
