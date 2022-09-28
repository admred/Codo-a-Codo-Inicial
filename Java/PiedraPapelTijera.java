import java.util.Scanner;
import java.util.Random;


// piedra Papel o tijera usando switch

class PiedraPapelTijera {


    public static void main(String[] args ) {
        
        int opcionJugador;
        int opcionComputadora;
        
        System.out.println("Opcion: 1 = Piedra , 2 = Papel o 3 = Tijera");
        
        Scanner leer=new Scanner(System.in);
        opcionJugador=leer.nextInt();
        
        opcionComputadora=new Random().nextInt(3)+1;
        
        if(opcionComputadora == opcionJugador){
            
            System.out.println("Empate");
            return;
        }
        
        switch(opcionJugador){
        case 1:
            if (opcionComputadora == 2){
                System.out.println("Perdiste. Papel mata piedra");
            } else {
                System.out.println("Ganaste. Piedra mata tijera");
            }
            break;
        case 2:
            if (opcionComputadora == 3){
                System.out.println("Perdiste. Tijera mata papel");
            } else {
                System.out.println("Ganaste. Papel mata piedra");
            }
            break;
        case 3:
            if (opcionComputadora == 1){
                System.out.println("Perdiste. Piedra mata tijera");
            } else {
                System.out.println("Ganaste. Tijera mata papel");
            }
            break;
        default:
            System.out.println("Opcion no valida");
        }
    }
}
