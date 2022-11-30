import java.util.ArrayList;
import java.util.Random;


// Desafio I en diapositiva de JAVA

// Galleta de la Suerte

class GalletaDeLaSuerte {


    public static void main(String[] args ){
        ArrayList<String> frase=new ArrayList<String>();
        int numSuerte;

        frase.add("No dejes pasar el tiempo");
        frase.add("Futuro brillante te espera");
        frase.add("Tus esfuerzos daran frutos.");
        frase.add("Buena suerte te acompaña");
        frase.add("Conoceras al amor de tu vida hoy");
        frase.add("El saber te hara libre");
        frase.add("La practica hace al maestro");

        numSuerte=new Random().nextInt(frase.size());

        System.out.println(frase.get(numSuerte));

    }
}