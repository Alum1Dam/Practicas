/*
 * Hemos hecho un programa donde calculamos el área de un cuadrado
 */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        int a, resultado ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        a = sc.nextInt();
        resultado = a * a;
        System.out.println(resultado);

        sc.close();
    }
}