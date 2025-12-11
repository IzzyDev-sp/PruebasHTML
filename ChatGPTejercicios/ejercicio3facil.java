/*Leer un número entero con Scanner.

Mostrar la tabla en formato:

número x 1 = resultado
número x 2 = resultado
...
Debe emplear un bucle (for recomendado).*/


package ChatGPTejercicios;
import java.util.*;
public class ejercicio3facil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu número:");

        int num1 = scanner.nextInt();

        for(int i=1; i<11; i++){

            System.out.println("Resultado " + i + " : " + num1 + " + " + i + " = " + num1*i);

        }

        scanner.close();
    }
    
}
