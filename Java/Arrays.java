
// Ejercicio en clase sobre los Arrays

class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[]  calzado = {32,38,40,41,42,43,46};
        String[] paises = {"Argentina","Chile","Uruguay","Brazil"};
        char[] vocales = {'a','e','i','o','u'};

        numeros[0]=1;
        numeros[1]=0;
        numeros[2]=2022;
        numeros[3]=-3;
        numeros[4]=31;

        for(int i=0; i < numeros.length ;i++){
            System.out.println("numeros["+i+"] = "+numeros[i]);
        }

        for(int i=0; i < paises.length ;i++){
            System.out.println("paises["+i+"] = "+paises[i]);
        }
    }
}
