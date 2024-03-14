//3. Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en
//minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String.
package guia2;

import java.util.Scanner;

public class Ejercicio3 {

Scanner leer = new Scanner(System.in);

public void mayusminus(){
    System.out.println("ingrese una frase ");
    String frase=leer.nextLine();
    System.out.println("cambiar a mayuscula "+frase.toUpperCase());
    System.out.println("cambiar a minuscula "+frase.toLowerCase());
}
    
}
