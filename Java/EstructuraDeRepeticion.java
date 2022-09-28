

// Ejercicio en clase

class EstructuraDeRepeticion {

    public static main(String[] args){

        int i=0; 

        // while cuando no se conoce cuantas repeticiones se van hacer
        while( i < 5 ){
            System.out.println("While = "+i);
            i++;
        }
        
        // while invertido
        do {
            
            System.out.println("Do While = "+i);
            i++;
            
        }while( i < 5);
        
        
        // for cuando sabemos cuantas repetiicones van a ser
        for( int j=0; j < 5 ;j++ ){
            System.out.println( "For = "+j);
        }
    }
}
