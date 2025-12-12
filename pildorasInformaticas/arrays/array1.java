package pildorasInformaticas.arrays;

public class array1 {

    public static void main(String[] args) {
        
        //int [] valores = new int[5];

        int [] valores = {1,2,4,5,6};

        //i<5 refiere a solo 5 numeros
        //for(int i=0; i<5; i++){

        // valores.lenght recorre el array en toda su extensión.
        
        /*for(int i=0; i< valores.length; i++){

            System.out.println("dame valores de i:" + valores[i]);
        }*/

            //BUCLE FOR EACH
        for (int i : valores) {

            System.out.println(i);
            
        }

        
        

    }
    
}
