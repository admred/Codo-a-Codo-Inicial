import java.util.Scanner;
import java.util.ArrayList;
// Ejercicio Desafio II en pptx sobre Arrays

class CosasQueComprar {
    public static void main(String[] args) {
        ArrayList<String> cosas=new ArrayList<String>();
        char continuar;
        String producto;
        Scanner leer=new Scanner(System.in);

        System.out.println("Cargar Listado de cosas que comprar");
        do{
            System.out.println("Ingresar Item ");
            cosas.add(leer.next());
            System.out.println("Continuar? [s/n]");
            continuar=leer.next().charAt(0);
        }while(continuar == 's');


        do{
            System.out.println("Buscador de producto");
            producto=leer.next();
            if(cosas.indexOf(producto) != -1){
                System.out.println("Si, tenés que comprar el producto");
            }
            System.out.println("Continuar? [s/n]");
            continuar=leer.next().charAt(0);
        }while(continuar == 's');
    }
}