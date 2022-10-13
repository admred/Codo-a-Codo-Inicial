import java.util.ArrayList;
import java.util.Scanner;
// Ejecricio en clase sobre array (3ra clase sobre arrays)


class ListaDeNombres {
    public static void main(String[] args){
        ArrayList<String> nombres= new ArrayList<String>();
        Scanner leer=new Scanner(System.in);

        for(int i=0; i<5 ;i++) {
            System.out.println("Ingresar nombre : ");
            nombres.add(leer.nextLine());
        }

        nombres.remove(1);

        for(String nombre : nombres ){
            System.out.println("Nombre : "+nombre);
        }
    }
}
