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

// Funcionalidad Arriesgar agregarda


class JuegoAhorcado {

    static void leerArchivo(ArrayList<String> lista) {
        String ruta="palabras.txt";
        File archivo = new File(ruta);
        Scanner leer=null;

        try{
            leer=new Scanner(archivo);

            while(leer.hasNextLine()){
                lista.add( leer.nextLine() );
            }
            leer.close();
        }catch(Exception ex){
            System.err.println("Error no se puede leer archivo "+ruta);
        }
    }

    static void dibujarBase(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------");
    }
    static void dibujarMastil(){
        System.out.println("");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    static void dibujarViga(){
        System.out.println("   +---+");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    static void dibujarCabeza(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    static void dibujarTorso(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println("   |   |");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    static void dibujarBrazos(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println(" --|-- |");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("-------+------");
    }
    static void dibujarPiernas(){
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("  ( )  |");
        System.out.println(" --|-- |");
        System.out.println("   |   |");
        System.out.println("  / \\  |");
        System.out.println("       |");
        System.out.println("-------+------");
    }

    static void dibujarAhorcado(int intentos){
        switch(intentos){
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
                break;
        }
    }

    static boolean arriesgar(String secreto){
        Scanner leer=new Scanner(System.in);
        System.out.print("Arriesgar Palabra : ");
        String palabra=leer.nextLine().toUpperCase();
        return palabra.equals(secreto);
    }

    public static void main(String[] args) {

        char letra;
        int i=0;
        boolean encontrado=false;
        int intentos=0;
        boolean gameover=false;
        Scanner leer=new Scanner(System.in);

        ArrayList<String> palabras=new ArrayList<String>();
        leerArchivo(palabras);


        // elegimos una palabra aleatoria
        String palabra=palabras.get( new Random().nextInt(palabras.size()) ) ;

        palabra=palabra.toUpperCase();

        char[] secreto=palabra.toCharArray();
        char[] adivinadas=palabra.replaceAll(".","_").toCharArray();

        System.out.println("1 - Arriesgar | 2 - Salir");



        //System.out.println("");
        // loop principal del juego

        do{
            dibujarAhorcado(intentos);
            System.out.println("Son "+adivinadas.length+" letras : "+String.valueOf(adivinadas));
            System.out.print("Opcion/Letra : ");
            letra = leer.nextLine().charAt(0);

            if ( letra == '1' ){
                if( arriesgar(palabra)){
                    adivinadas=secreto;
                    break;
                } else {
                    System.out.println("Incorrecto");
                    intentos++;
                    continue;
                }
            } else if ( letra == '2' ) {
                return;
            } else if ( ! Character.isDigit(letra)) {
                letra = Character.toUpperCase(letra);
                // aca buscamos la letra recorriendo el arreglo secreto
                for(i=0; i<secreto.length; i++){
                    if( letra == adivinadas[i] ) {
                        System.out.println("Ya estaba adivinada. No pasa nada.");
                        break;
                    }
                    if(secreto[i] == letra) {
                        adivinadas[i] = letra;
                        secreto[i] = '-'; // elimnamos para no volver repetir
                    }
                }
                if(i==secreto.length){
                    intentos++;
                }
                //dibujarAhorcado(intentos);
            }

        }while(intentos < 6);

        if(intentos < 6 ) {
            System.out.println("GANASTE ! "+palabra);
        } else {
            System.out.println("PERDISTE ! La palabra era "+palabra);
        }
    }
}