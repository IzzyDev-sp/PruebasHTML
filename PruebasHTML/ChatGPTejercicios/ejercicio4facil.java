/*Usar Scanner para leer una cadena de texto.

Convertir el nombre a mayúsculas usando .toUpperCase().

Obtener la longitud con .length().

Mostrar ambos datos en pantalla. */

package ChatGPTejercicios;
import java.util.*;
public class ejercicio4facil {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu texto:");

        String texto=scanner.nextLine();

        int n=texto.length();

        String y=texto.toUpperCase();

        System.out.println("El texto tiene " + n + " letras y en mayoscula es: " + y);

        scanner.close();



    }
    
}
