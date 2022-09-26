import java.util.Scanner;

class AdivinarNumero {
    public static void main(String[] args) {
        int nroElegido=0;
        int nroIngresado=3;
        boolean esIgual=false;
        
        System.out.println("Ingresar Nro : ");
        Scanner leer=new Scanner(System.in);
        nroElegido=leer.nextInt();

        esIgual = nroElegido == nroIngresado;
        if(esIgual == true ){
            System.out.println("Adivinaste el Nro :) ");
        } else {
            System.out.println("No adivinaste el Nro :(");
        }
    }
}
