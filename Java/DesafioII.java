import java.util.Scanner;

// Ejercicio propuesto. Desafio II de diapositivo 11 

// Usar swtich


class DesafioII{

    public static void main(String[] args) {
        int calificacion;
        
        System.out.println("Ingresar calificacion ...");
        Scanner leer=new Scanner(System.in);
        calificacion=leer.nextInt();
        
        
        switch(calificacion){
        case 10:
            System.out.println("Matricula de Honor");
            break;
        case 9:
            System.out.println("Sobresaliente");
            break;
        case 7:
        case 8:
            System.out.println("Notable");
            break;
        case 6:
            System.out.println("Bien");
            break;
        case 5:
            System.out.println("Aprobado");
            break;
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
            System.out.println("Suspenso");
            break;
        default:
            System.out.println("Valor fuera de rango");
        }
    }
}
