//5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
//triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().
package guia2;

import java.util.Scanner;

public class Ejercicio5 {
    
Scanner leer =new Scanner(System.in);

public void mostrar(){
    System.out.println("ingrese un numero");
    
int num =leer.nextInt();

    System.out.println("la raiz cuadrade es "+Math.sqrt(num));
    System.out.println("el doble es "+(num*2) );
    System.out.println("el triple es "+(num*3));
}    

    
    
}
