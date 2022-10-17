/*
 * 7. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma,
   resta, producto y división.
 */

import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        
        int num1, num2, suma, resta, producto, division;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Dime el segundo número: ");
        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1 / num2;
        
        //Esto sumara ambos números
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        //Esto restará ambos números
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        //Esto multiplicará ambos números
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
        //Esto dividirá ambos números
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);

        sc.close();
    }
}