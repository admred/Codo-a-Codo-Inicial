import java.util.ArrayList;

// Ejercicio en clases sobre arrays

class Autos {
    public static void main(String[] args ){
        ArrayList<String> autos=new ArrayList<String>();

        autos.add("Volvo");
        autos.add("Chevrolet");
        autos.add("Ford");
        autos.add("Peugeot");
        autos.add("Renault");

        for(String auto: autos){
            System.out.println(auto);
        }
    }
}