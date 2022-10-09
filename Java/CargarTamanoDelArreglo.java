import java.util.Scanner;
import java.util.ArrayList;
// Ejercicio Desafio III en pptx sobre Arrays

class CargarTamanoDelArreglo {
    public static void main(String[] args) {
        String[] cosas;
        int tamano;
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingresar tamaño del arreglo");
        tamano=leer.nextInt();

        if(tamano<1){
            System.out.println("Tamaño tiene que ser mayor que 0");
            return;
        }
        // crear arreglo con el tamano
        cosas=new String[tamano];

        for(int i=0;i<tamano;i++){
            System.out.println("Ingresar Elemento "+(i+1));
            cosas[i]=leer.next();
        }
        System.out.println("Elementos cargados");
        for(String cosa:cosas){
            System.out.println(cosa);
        }
    }
}


