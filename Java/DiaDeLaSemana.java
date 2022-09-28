import java.util.Scanner;

// Dia de la Semana, ejercicio en clase


class DiaDeLaSemana {

    public static void main(String[] args) {

        int dia;

        System.out.println("Ingrese numero del dia de la semana");

        Scanner leer = new Scanner(System.in);

        dia = leer.nextInt();

        switch(dia){
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Incorrecto");
        }    
    }
}
