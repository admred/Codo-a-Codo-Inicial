import java.util.Scanner;

// Ejercicio Desafio I de Arrays en pptx

class Cargar10Notas {
    public static void main(String[] args) {
        float[] notas=new float[10];
        float suma=0;
        Scanner leer=new Scanner(System.in);
        int i=0;

        // cargar las notas
        for(i=0;i<10; i++){
            System.out.println("Cargar Nota "+(i+1));
            notas[i]=leer.nextFloat();
            suma=suma+notas[i];
        }

        // mostrar las notas
        for(i=0;i<10;i++){
            System.out.println("Nota["+i+"] = "+notas[i]);
        }

        // mostrar promedio
        System.out.println("Promedio : "+(suma/10));
    }
}