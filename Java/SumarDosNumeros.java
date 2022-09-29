// Ejercicio en clase

import java.util.Scanner;

class SumarDosNumeros {

    public static void  main(String [] args) {
        int numero1,numero2,suma;
        char respuesta;
        Scanner leer=new Scanner(System.in);

        do{
            System.out.println("Igrese el numero 1");
            numero1=leer.nextInt();

            System.out.println("Igrese el numero 2");
            numero2=leer.nextInt();

            suma = numero1 + numero2;

            System.out.println("Su suma es = "+suma);

            System.out.println("Quiere continuar? [s/n]");

            respuesta=leer.next().charAt(0);

        }while(respuesta == 's' || respuesta == 'S');


    }
}