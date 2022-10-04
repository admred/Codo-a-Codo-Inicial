
// Ultimo Ejericio de la Guia de Ejercicios


class CifradoCesar {

    public static void main(String[] args ){
        char[] cipherText=new String("Qg jmepyq tcp cqrc KCLQYHC, cqryq ayby tcx kyq acpay bc qcp BGMQ.").toCharArray();
        char[] plainText=new char[100];
        int offset;
        int symbol;
        int desplazamientosPosibles=26;

        for(int i=0;i<desplazamientosPosibles;i++){
            for(int j=0;j<cipherText.length;j++){
                symbol=cipherText[j];
                if(Character.isWhitespace(symbol) || symbol == ',' || symbol == '.'){
                    plainText[j]=Character.toChars(symbol)[0];
                    continue;
                }
                if(Character.isUpperCase(symbol))
                    offset='A';
                else
                    offset='a';

                plainText[j]= Character.toChars( offset+ (symbol-offset+i)%desplazamientosPosibles )[0] ;
            }
            System.out.println(plainText);
        }
    }
}

