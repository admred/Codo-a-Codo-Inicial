// Segunda parte del ejercicio en clase sobre Arrays

class Arrays2 {
    public static void main(String[] args) {
        int[][] matrix2d={
            {1,2,3,4,5},
            {2,4,6,8,10},
            {3,6,9,12,15},
            {4,8,12,16,20}
        };

        int[][][] matrix3d= {
            {
                {1,2,3},
                {1,2,3},
                {1,2,3}
            },{
                {1,2,3},
                {1,2,3},
                {1,2,3}
            },{
                {1,2,3},
                {1,2,3},
                {1,2,3}
            }
        };

        for(int i=0; i < matrix2d.length ; i++){
            for(int j=0; j < matrix2d[0].length ; j++){
                System.out.println("matrix2d[ "+i+" ][ "+j+" ] : "+ matrix2d[i][j]);
                }
            }

        for(int i=0; i < matrix3d.length ; i++){
            for(int j=0; j < matrix3d[0].length ; j++){
                for(int k=0; k < matrix3d[0][0].length ; k++){
                    System.out.println("matrix3d[ "+i+" ][ "+j+" ][ "+k+" ] : "+ matrix3d[i][j][k]);
                }
            }
        }
    }
}