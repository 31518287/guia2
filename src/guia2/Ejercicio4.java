//4. Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
//en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package guia2;

import java.util.Scanner;

public class Ejercicio4 {
    
Scanner leer = new Scanner(System.in);

public void fahrenheit(){
    
    int c;
    double f;
    System.out.println("ingrese los grados centigrados ");
    c=leer.nextInt();
    f=32+(9*c/5);
    System.out.println("mostrar "+f);


}

    
    
    
    
}
