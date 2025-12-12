/*Usar Scanner para leer un número entero.

Usar condicionales if / else if / else.
Mostrar uno de estos mensajes:
"El número es positivo"
"El número es negativo"
"El número es cero" */

package ChatGPTejercicios;

import java.util.*;
public class ejercicio5facil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu número.");

        int num = input.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0 ) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        input.close();
        
    }
    
}
