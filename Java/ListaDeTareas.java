import java.util.ArrayList;
import java.util.Scanner;
// Ejecricio en clase sobre array (3ra clase sobre arrays)

// Con el Scanner hay un problema que se saltea la primera lectura
// despues del primer ciclo, la solucion es usar 2 Scanners

// https://stackoverflow.com/questions/50845958/scanner-gets-skipped/50869232#50869232

class ListaDeTareas {
    public static void main(String[] args){
        ArrayList<String> tareas= new ArrayList<String>();

        Scanner continuar=new Scanner(System.in);
        Scanner leer=new Scanner(System.in);

        do{
            System.out.println("Escriba una tarea");
            tareas.add( leer.nextLine());

            System.out.println("Ingresar otra tarea? [s/n]");

        }while(continuar.next().equals("s"));

        for(int i=0; i<tareas.size() ;i++ ){
            System.out.println("Tarea  "+i+": "+tareas.get(i));
        }
    }
}
