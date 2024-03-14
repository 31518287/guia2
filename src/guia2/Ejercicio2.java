//2. Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package guia2;

import java.util.Scanner;

public class Ejercicio2 {
    
    Scanner leer =new Scanner(System.in);
    
    public void nombre(){
        String nombre;
        System.out.println("ingrese un nombre");
     nombre=leer.nextLine();
        System.out.println("el nombre es "+nombre);
    }
    
    
    
    
}
