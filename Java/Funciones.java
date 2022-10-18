import java.util.Scanner;
// clase sobre funciones 18-10-2022

public class Funciones {

    public static void hola(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("¿Como esta "+nombre+"?");
        System.out.println("¡Nos vemos "+nombre+"!");
    }
    public static void hola5veces(String nombre)  {
        for(int i=0 ; i < 5; i++){
            System.out.println(i+"-------------");
            hola(nombre);
        }
    }
    public static String saludar(String nombre){

        return new String("Hola "+nombre);

    }

    public static void main (String[] args) {
        Scanner leer= new Scanner(System.in);


        System.out.println("Ingrese su nombre");
        String nombre=leer.nextLine();

        hola5veces(nombre);


        System.out.println(saludar(nombre));
    }
}

