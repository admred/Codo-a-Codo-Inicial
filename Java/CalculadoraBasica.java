// Calculadora facil

// Ejercicio en clase

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;



class CalculadoraBasica {

    static double sumar(double a,double b){
        double resultado=a+b;
        return resultado;
    }
    static double restar(double a,double b){
        double resultado=a-b;
        return resultado;
    }
    static double multiplicar(double a,double b){
        double resultado=a*b;
        return resultado;
    }
    static double dividir(double a,double b){
        double resultado=a/b;
        return resultado;
    }
    static double ingresarNumero(String mensaje){
        Scanner leer= new Scanner(System.in);
        System.out.println(mensaje);
        double resultado=Double.valueOf(leer.next());
        return resultado;
    }
    public static void main(String[] args ) {
        double numeroA;
        double numeroB;
        int opcion;
        double resultado;

        do {
            System.out.println("1 - Sumar | 2 - Restar | 3 - Multiplicar | 4 - Dividir | 5 - Salir");
            opcion = (int)ingresarNumero("Ingresar Opcion");
            if(opcion == 5)
                break;

            numeroA = ingresarNumero("Ingresar primer numero");
            numeroB = ingresarNumero("Ingresar segundo numero");

            switch(opcion){
                case 1 :
                    resultado=sumar(numeroA,numeroB);
                    System.out.println(numeroA+" + "+numeroB+" = "+resultado);
                    break;
                case 2 :
                    resultado=restar(numeroA,numeroB);
                    System.out.println(numeroA+" - "+numeroB+" = "+resultado);
                    break;
                case 3 :
                    resultado=multiplicar(numeroA,numeroB);
                    System.out.println(numeroA+" * "+numeroB+" = "+resultado);
                    break;
                case 4 :
                    if(numeroB == 0){
                        System.out.println("Divisor no puede ser 0");
                        break;
                    }
                    resultado=dividir(numeroA,numeroB);
                    System.out.println(numeroA+" / "+numeroB+" = "+resultado);
                    break;
            }
        }while(opcion != 5);
    }
}