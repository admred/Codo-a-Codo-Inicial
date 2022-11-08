import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.File;

// Ejercicio propuesto por el profe

// Mi idea es usar 2 arreglos o strings. En uno voy sacando
// las letras y en otro mentiendolas respetando la ubicacion.

// Sobre la cantidad de oportunidades es arbitraria, llevo
// un contador de errores, cuando mas errores mas"ahorcado"
// esta. Finalmente pierde o gana si completa la palabra

// Ejercicio modificado con persistencia de datos


class JuegoAhorcado {

    public static void leerArchivo(ArrayList<String> lista) {
        String ruta="palabras.txt";
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
            System.err.println("Error no se puede leer archivo "+ruta);
        }
    }

    public static void dibujarBase(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------");
    }
    public static void dibujarMastil(){
        System.out.println("");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    public static void dibujarViga(){
        System.out.println("   +---+");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    public static void dibujarCabeza(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    public static void dibujarTorso(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println("   |   |");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    public static void dibujarBrazos(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println(" --|-- |");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    public static void dibujarPiernas(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println(" --|-- |");
        System.out.println("   |   |");
        System.out.println("  / \\  |");
        System.out.println("       |");
        System.out.println("-------+------");
    }

    public static void main(String[] args) {
        int error=0;
        char letra;
        boolean encontrado=false;
        int encontradoContador=0;
        boolean gameover=false;
        Scanner leer=new Scanner(System.in);
        /*
        String[] palabras = {
            "Programacion",
            "Java",
            "Ejercicio",
            "Ahorcado",
            "Codo",
            "Argentina",
            "Octubre",
            "Calor",
            "Supercalifragilisticoespialidoso"
            };
        */

        ArrayList<String> palabras=new ArrayList<String>();
        leerArchivo(palabras);


        // elegimos una palabra aleatoria
        String palabra=palabras.get( new Random().nextInt(palabras.size()) ) ;

        palabra=palabra.toUpperCase();

        char[] secreto=palabra.toCharArray();
        char[] adivinadas=palabra.replaceAll(".","_").toCharArray();

        System.out.println("JUEGO DEL AHORACADO");
        System.out.println("Son "+secreto.length+" letras");
        System.out.println("");

        // loop principal del juego
        do{
            System.out.println(adivinadas);

            letra=leer.nextLine().charAt(0);
            letra=Character.toUpperCase(letra);

            // aca buscamos la letra recorriendo el arreglo secreto
            for(int i=0;i<secreto.length;i++){
                if(secreto[i] == letra){
                    adivinadas[i]=letra;
                    secreto[i]='-'; // elimnamos para no volver repetir
                    encontrado=true;
                    encontradoContador++;
                }
            }
            if( !encontrado ){
                error++;
            }
            encontrado=false; // reset a esta variable

            // Aca detectamos cuando se gano,
            if(encontradoContador == secreto.length){
                break; // romper ciclo do-white
            }

            // este switch se encarga de hacer el dibujito
            // podria meter esto en un dibujarAhorado(error);
            switch(error){
                case 1:
                    dibujarBase();
                    break;
                case 2:
                    dibujarMastil();
                    break;
                case 3:
                    dibujarViga();
                    break;
                case 4:
                    dibujarCabeza();
                    break;
                case 5:
                    dibujarBrazos();
                    break;
                case 6:
                    dibujarPiernas();
                    gameover=true;
                    break;
            }

        }while(!gameover);

        if(!gameover) {
            System.out.println("GANASTE ! "+palabra);
        } else {
            System.out.println("PERDISTE ! La palabra era "+palabra);
        }
    }
}