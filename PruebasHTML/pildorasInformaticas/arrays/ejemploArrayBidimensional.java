package pildorasInformaticas.arrays;

public class ejemploArrayBidimensional {

    public static void main(String[] args) {
        
        int[][] numeros = new int [5] [3]; 

                    // --- FILA 0 ---
            numeros[0][0]=1;
            numeros[0][1]=2;
            numeros[0][2]=3;

            // --- FILA 1 ---
            numeros[1][0]=4;
            numeros[1][1]=5;
            numeros[1][2]=6;

            // --- FILA 2 ---
            numeros[2][0]=7;
            numeros[2][1]=8;
            numeros[2][2]=9;

            // --- FILA 3 ---
            numeros[3][0]=11;
            numeros[3][1]=12;
            numeros[3][2]=13;

            // --- FILA 4 ---
            numeros[4][0]=14;
            numeros[4][1]=15;
            numeros[4][2]=16;

        //Bucle for anidad para recorrer el array bidimensional

        //For para primera dimensión

        for(int i=0; i<5; i++){

            //FOR anidado para segunda dimensión

            for(int z=0; z<3; z++){

                System.out.print(numeros[i][z] + " ");

            }
        }

        


    }
    
}
