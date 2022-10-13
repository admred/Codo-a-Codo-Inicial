import java.util.Scanner;
import java.util.ArrayList;
// Ejercicio Desafio II en pptx sobre Arrays

// Con el Scanner hay un problema que se saltea la primera lectura
// despues del primer ciclo, la solucion es usar 2 Scanners

// https://stackoverflow.com/questions/50845958/scanner-gets-skipped/50869232#50869232

class CosasQueComprar {
    public static void main(String[] args) {
        ArrayList<String> cosas=new ArrayList<String>();
        String producto;
        char continuar;
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);

        System.out.println("Cargar Listado de cosas que comprar");
        do{
            System.out.println("Ingresar Item ");
            cosas.add(leer.nextLine());
            System.out.println("Continuar? [s/n]");
            continuar=leer1.next().charAt(0);
        }while(continuar ==  's' ) ;


        do{
            System.out.println("Buscador de producto");
            producto=leer.next();
            if(cosas.indexOf(producto) != -1){
                System.out.println("Si, tenés que comprar el producto");
            }
            System.out.println("Continuar? [s/n]");
            continuar=leer1.next().charAt(0);
        }while(continuar == 's');
    }
}
