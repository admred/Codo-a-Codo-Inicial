
// Strings, explorando sus metodos

class Strings {

    public static void main(String[] args) {
        String nombre = "Roberto";
        String apellido = "Apellido";

        System.out.println("Longitud      = "+nombre.length());
        System.out.println("Mayusulas     = "+nombre.toUpperCase());
        System.out.println("Minusculas    = "+nombre.toLowerCase());
        System.out.println("Tercera Letra = "+nombre.indexOf("b"));

        System.out.println("Concatenacion = "+nombre.concat(apellido));
    }
}
