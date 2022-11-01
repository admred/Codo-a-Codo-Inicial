import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// Clase sobre Persistencia de Datos (archivos)


class EscribirLeerUnArchivo {

    public static void leerArchivo() {
        String ruta="listaCompras.txt";
        File archivo = new File(ruta);
        Scanner leer=null;

        try{

            leer=new Scanner(archivo);

            while(leer.hasNextLine()){
                String linea=leer.nextLine();
                System.out.println(linea);
            }
            leer.close();

        }catch(Exception ex){
            ex.printStackTrace();
            System.err.println("Excepcion : "+ex.getMessage());
        }
    }

    public static void escribirArchivo(ArrayList<String> lista) {
        FileWriter archivo =null;
        String ruta="listaCompras.txt";

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
    public static void main(String[] args ) {
        ArrayList<String> lista=new ArrayList<String>();

        lista.add("Pera");
        lista.add("Manzana");
        lista.add("Naranja");
        lista.add("Banana");
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Lechuga");
        lista.add("Tomate");
        lista.add("Cebolla");

        //System.out.println(lista);

        escribirArchivo(lista);
        leerArchivo();
    }
}