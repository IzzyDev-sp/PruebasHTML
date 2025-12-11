/*📌 Requisitos
Debes usar Scanner para leer dos números.
El programa debe mostrar:
"El primer número es mayor" si el primero es mayor.
"El segundo número es mayor" si el segundo es mayor.
"Ambos números son iguales" si no hay diferencia.
No uses métodos adicionales, solo lógica básica.*/

package ChatGPTejercicios;

import java.util.*;

public class ejercicio2facil {
    public static void main(String[] args) {

    Scanner input1 = new Scanner (System.in);

    System.out.println("Introduce el primer número:");

    int num1=input1.nextInt();

    Scanner input2 = new Scanner (System.in);

    System.out.println("Introduce el segundo número:");

    int num2=input2.nextInt();

    if (num1>num2) {
        System.out.println("El primer número es mayor");
    }else if(num2>num1){
        System.out.println("El segundo número es mayor");
    }else if (num1==num2) {
        System.out.println("Ambos números son iguales.");
    }

    input1.close();
    input2.close();


        
    }
}
