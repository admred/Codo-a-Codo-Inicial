import java.util.ArrayList;
// clase sobre funciones 18-10-2022

public class ArrayFunciones {


    public static String saludar(String nombre) {
        String saludo;
        saludo="Hola "+nombre;
        return saludo;
    }

    public static void saludarArrayList(ArrayList<String> lista){
        for(int i=0;i<lista.size();i++){
            System.out.println(saludar(lista.get(i)));
        }
    }

    public static void main (String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Paola");
        nombres.add("Jonathan");
        nombres.add("Julieta");
        nombres.add("Cristian");

        saludarArrayList(nombres);
    }
}

