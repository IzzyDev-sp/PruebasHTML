package ChatGPTejercicios;
import java.util.*;

public class ejercicio1facil {

    public static void main(String[] args) {

       Scanner num=new Scanner(System.in);

       System.out.println("Escribe un número:");

       int numero=num.nextInt();

       if (numero%2==0) {
            System.out.println("El número es par.");

       }else{
        System.out.println("El nmuero es impar.");
       }
        num.close();
    }
    
}
