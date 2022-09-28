import java.util.Scanner;


// Ejercicio de clase pero mezclado con otras cosas
// Numero de la suerte, Variables, operadores, etc

public class InicializacionDeVariables{

    public static void main(String[] args){

        boolean verdadero = false;
        
        int numero1 = 16;

        int numeroElejidoPorLaPC;

        numero1+=numero1 + 36;
        
        System.out.println("Ingresar un numero ...");
        
        numero1=new Scanner(System.in).nextInt();
            
        numeroElejidoPorLaPC=(int)(Math.random()*10);

        
        System.out.println("Numero elegido por la pc es "+numeroElejidoPorLaPC);
        
        numero1--;
        
    }
}
