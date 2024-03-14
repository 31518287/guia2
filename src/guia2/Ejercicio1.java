//1. Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
//mostrando por consola la suma de los mismos.
package guia2;
import java.util.Scanner;
public class Ejercicio1 {
    
    Scanner leer=new Scanner(System.in);
    
    public void sumar(){
        System.out.println("ingrese primer numero");
    int num1=leer.nextInt();
    System.out.println("ingrese segundo numero");
    int num2=leer.nextInt();
    int resultado=(num1+num2);
        System.out.println("el resultado es "+resultado);
       
    
        
    }
    
    
    
    
}
