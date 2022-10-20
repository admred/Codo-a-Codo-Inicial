import java.util.ArrayList;
import java.util.Scanner;

// Ejercicio en clase sobre funciones (parte 2)

class Funciones2 {

    public static int ingresarUnNumero(String mensaje){
        Scanner leer=new Scanner(System.in);
        System.out.println(mensaje);
        return leer.nextInt();
    }

    // El orden (y tipo) de los parametros se deben respetar
    public static void datosPersonales(String apellido, String nombre, int edad){
        System.out.println("---------------------");
        System.out.println("Apellido "+apellido);
        System.out.println("Nombre   "+nombre);
        System.out.println("Edad     "+edad);
    }

    public static void datosPersonales2(){
        Scanner leer=new Scanner(System.in);
        String apellido,nombre;
        int edad;

        System.out.println("Ingresar Apellido");
        apellido=leer.nextLine();
        System.out.println("Ingresar Nombre");
        nombre=leer.nextLine();

        edad=ingresarUnNumero("Ingresar Edad");

        datosPersonales(apellido,nombre,edad);

    }

    public static void main(String[] args){
        int numero1,numero2,numero3;
        ArrayList<Integer> numeros=new ArrayList<Integer>();

        numero1=ingresarUnNumero("Ingrese un numero 1");
        numero2=ingresarUnNumero("Ingrese un numero 2");
        numero3=ingresarUnNumero("Ingrese un numero 3");

        System.out.println("Suma es "+(numero1+numero2+numero3));
        System.out.println("---------------------");

        //datosPersonales("Benito","Camela",23);
        datosPersonales2();

        System.out.println("---------------------");

        for(int i=0;i<10;i++){
            numeros.add(ingresarUnNumero("Ingresar numero "+(i+1)));
        }
        System.out.println(numeros);
    }
}