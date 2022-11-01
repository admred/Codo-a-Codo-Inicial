import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

// Ejercicio en clase sobre funciones (parte 3)
// Segunda parte de este ejercicio con Persistencia

class ListadoDeCompras {

    public static void leerArchivo(ArrayList<String> lista) {
        String ruta="listaCompras1.txt";
        File archivo = new File(ruta);
        Scanner leer=null;

        try{
            leer=new Scanner(archivo);

            while(leer.hasNextLine()){
                lista.add( leer.nextLine() );
                //System.out.println(linea);
            }
            leer.close();

        }catch(Exception ex){
            //ex.printStackTrace();
            //System.err.println("Excepcion : "+ex.getMessage());
        }
    }

    public static void escribirArchivo(ArrayList<String> lista) {
        FileWriter archivo =null;
        String ruta="listaCompras1.txt";

        try{
            archivo = new FileWriter(ruta);

            for(String item: lista){
                archivo.write(item+"\n");
            }
            archivo.close();
        }catch(Exception ex){
            ex.printStackTrace();
            System.err.println("Excepcion : "+ex.getMessage());
        }
    }

    public static void agregar(ArrayList<String> listado){
        Scanner leer=new Scanner(System.in);
        System.out.println("Agregar Nuevo Item");
        String item=leer.nextLine();
        listado.add( item );
    }
    public static void eliminar(ArrayList<String> listado){
        Scanner leer=new Scanner(System.in);
        String item;
        verListado(listado);

        System.out.println("Que elemento quiere eliminar?");

        String itemBuscado=buscarItem( listado, leer.nextLine() );
        if(itemBuscado != null) {
            listado.remove( itemBuscado );

        } else {
            System.out.println("El item no esta en la listado");
        }
    }
    public static void modificar(ArrayList<String> listado){
        Scanner leer=new Scanner(System.in);
        System.out.println("Buscar Item");
        String buscar = leer.nextLine();
        String item = buscarItem(listado,buscar);
        if( item != null){
            listado.remove(item);
            agregar(listado);
        } else {
            System.out.println("No se encontro el item");
        }
    }
    public static void verListado(ArrayList<String> listado){
        System.out.println(listado);
    }

    public static String buscarItem(ArrayList<String> listado,String item){
        int index=listado.indexOf(item);
        if(index == -1){
            return null;
        } else {
            return listado.get(index);
        }
    }

    public static void main (String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<String> listado= new ArrayList<String>();
        char opcion;

        // limpiar consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(" 1 - Agregar | 2 - Elimnar | 3 - Modificar | 4  - Ver Lista | 5 - Salir");
        leerArchivo(listado);
        do{
            System.out.printf("\nOpcion:");
            opcion=leer.next().charAt(0);

            switch(opcion){
                case '1':
                    agregar(listado);
                    break;
                case '2':
                    eliminar(listado);
                    break;
                case '3':
                    modificar(listado);
                    break;
                case '4':
                    verListado(listado);
                    break;
                case '5':
                    break;
                default:
                    System.out.println("Opcion fuera de rango");

                }
        }while(opcion != '5');


        escribirArchivo(listado);
        System.out.println("Fin del programa");
    }
}
