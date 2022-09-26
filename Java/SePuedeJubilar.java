import java.util.Scanner;

class SePuedeJubilar {

    public static void main(String[] args) {
        int edad;
        String sexo;

        System.out.println("Ingresar Sexo:");
        Scanner leer = new Scanner(System.in) ;
        sexo=leer.nextLine();

        System.out.println("Ingresar Edad:");
        leer = new Scanner(System.in) ;
        edad = leer.nextInt();

        if ( sexo == "F" ||  sexo == "M" ) {


        } else {

        }
        
        leer.close();
    }
}

